package br.com.dnkt.designpatterns.command.model;

import br.com.dnkt.designpatterns.interfaces.Command;

public class KirbyRightCommand implements Command {
    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyRightCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveRight();

    }
}
