package years;

import model.Materials;
import model.type.Compulsory;
import model.type.Grade;
import model.type.ISubjects;
import model.type.ITests;

import java.util.List;

public class FifthYears implements ISubjects, ITests {
    private Grade grade;
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public Grade getGrade() {
        return grade;
    }

    @Override
    public void takeTransfiguration(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Transfiguration Class");
    }

    @Override
    public void takeDADA(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Defence Against the Dark Arts Class");
    }

    @Override
    public void takeCharms(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Charms Class");
    }

    @Override
    public void takePotions(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Potions Class");
    }

    @Override
    public void takeAstronomy(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Astronomy Class");
    }

    @Override
    public void takeHistoryOfMagic(List<Materials> materials, Compulsory compulsory) {
        System.out.println("History of Magic Class");
    }

    @Override
    public void takeHerbology(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Herbology Class");
    }

    @Override
    public void takeFlying(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Flying Class");
    }

    @Override
    public void takeArithmancy(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Arithmancy Class");
    }

    @Override
    public void takeMuggleStudies(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Muggle Studies Class");
    }

    @Override
    public void takeDivination(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Divination Class");
    }

    @Override
    public void takeAncientRunes(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Study of Ancient Runes Class");
    }

    @Override
    public void takeCareOfMagicalCreatures(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Care of Magical Creatures Class");
    }

    @Override
    public void takeAlchemy(List<Materials> materials, Compulsory compulsory) {}
    @Override
    public void takeApparation(List<Materials> materials, Compulsory compulsory) {}

    @Override
    public Grade takeOWL() {
        System.out.println("Take Ordinary Wizarding Level Test");
        return grade;
    }

    @Override
    public Grade takeNEWT() {
        return null;
    }
}