package Client.dto.init;

import Client.Model.InitMessage;

import java.util.List;
import java.util.stream.Collectors;

// cast client map to map
// 1. units have not casted.

// cast client cell to cell
// 1. units have not casted

// is it possible that one field stays null after casting?

public class ClientInitMessage {
    private GameConstants gameConstants;
    private ClientMap map;
    private List<ClientBaseUnit> baseUnits;
    private List<ClientSpell> spells;

    public InitMessage castToInitMessage() {
        InitMessage initMessage = InitMessage.createInitMessage();
        initMessage.setMapp(map.castToMap());
        initMessage.setBaseUnitList(
                baseUnits.stream().map(ClientBaseUnit::castToBaseUnit).collect(Collectors.toList())
        );
        initMessage.setSpells(
                spells.stream().map(ClientSpell::castToSpell).collect(Collectors.toList())
        );
        return initMessage;
    }

    public GameConstants getGameConstants() {
        return gameConstants;
    }

    public void setGameConstants(GameConstants gameConstants) {
        this.gameConstants = gameConstants;
    }

    public ClientMap getMap() {
        return map;
    }

    public void setMap(ClientMap map) {
        this.map = map;
    }

    public List<ClientBaseUnit> getBaseUnits() {
        return baseUnits;
    }

    public void setBaseUnits(List<ClientBaseUnit> baseUnits) {
        this.baseUnits = baseUnits;
    }

    public List<ClientSpell> getSpells() {
        return spells;
    }

    public void setSpells(List<ClientSpell> spells) {
        this.spells = spells;
    }
}
