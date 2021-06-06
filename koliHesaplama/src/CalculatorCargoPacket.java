import jdk.jshell.spi.SPIResolutionException;

public  class CalculatorCargoPacket extends InformationMaterials {

    int seven_count = 0;
    int two_count = 0;
    int rest_targetWeight = 0;

    PrepareCargoPacket calculator_result = new PrepareCargoPacket();
    public void restTargetWeight (int resttarget, int countNumber) {

        if (countNumber==7){
            rest_targetWeight=resttarget%7;
        }
        if (countNumber==2){
            rest_targetWeight=resttarget%2;

        }
    }


    public void packetCount(int targetWeight,int count){
        if (count==7){
            seven_count=targetWeight/7;
        }
        if (count==2){
            two_count=targetWeight/2;
        }
    }

    public boolean calculatorPacket(int seven_weight_piece, int two_weight_piece, int target_cargo_weight) {

        packetCount(target_cargo_weight,7);

        restTargetWeight(target_cargo_weight,7);


        if (rest_targetWeight == 0 && seven_count <= seven_weight_piece) {
            calculator_result.prepareResult(2,target_cargo_weight,seven_count,two_count);
        }
        if (rest_targetWeight == 0 && seven_count > seven_weight_piece) {
            calculator_result.prepareResult(-1,target_cargo_weight,seven_count,two_count);
        }

        if (rest_targetWeight != 0) {
            packetCount(rest_targetWeight,2);
            restTargetWeight(rest_targetWeight,2);

            int new_two=two_count;
            if (rest_targetWeight == 0 && two_count <= two_weight_piece && seven_count <= seven_weight_piece) {
                calculator_result.prepareResult(2,target_cargo_weight,seven_count,two_count);
            }

            if (rest_targetWeight == 0 && two_count > two_weight_piece|| seven_count > seven_weight_piece) {
                calculator_result.prepareResult(-1,target_cargo_weight,seven_count,two_count);
            }

            if (rest_targetWeight != 0) {

                for (int j = 1; j <= seven_count; j++) {
                    seven_count -= 1;
                    rest_targetWeight += (j * 7);
                    packetCount(rest_targetWeight, 2);
                    two_count=new_two +two_count;
                    restTargetWeight(rest_targetWeight,2);
                    if (rest_targetWeight == 0 && two_count <= two_weight_piece && seven_count <= seven_weight_piece) {
                        calculator_result.prepareResult(2,target_cargo_weight,seven_count,two_count);
                        break;
                    }
                    if (rest_targetWeight == 0 && two_count > two_weight_piece || seven_count > seven_weight_piece) {
                        calculator_result.prepareResult(-1,target_cargo_weight,seven_count,two_count);
                        break;

                    }
                    j++;

                }
                if (seven_count == 0 && rest_targetWeight!= 0) {
                    calculator_result.prepareResult(-1,target_cargo_weight,seven_count,two_count);
                }


            }
        }
    return finishPro();
    }

}

