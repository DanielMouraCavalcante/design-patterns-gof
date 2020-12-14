package br.com.dnkt.designpatterns.command.model;

import br.com.dnkt.designpatterns.interfaces.Command;

public class KirbyLeftCommand implements Command{
    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyLeftCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveLeft();
    }
}
