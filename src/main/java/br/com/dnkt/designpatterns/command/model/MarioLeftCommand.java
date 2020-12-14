package br.com.dnkt.designpatterns.command.model;

import br.com.dnkt.designpatterns.interfaces.Command;

public class MarioLeftCommand implements Command {

    private MarioCharacterReceiver marioCharacter;

    public MarioLeftCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveLeft();

    }
}
