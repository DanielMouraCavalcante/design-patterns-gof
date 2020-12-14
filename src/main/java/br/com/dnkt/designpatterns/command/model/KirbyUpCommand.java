package br.com.dnkt.designpatterns.command.model;

import br.com.dnkt.designpatterns.interfaces.Command;

public class KirbyUpCommand implements Command{

    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyUpCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveUp();
    }
}
