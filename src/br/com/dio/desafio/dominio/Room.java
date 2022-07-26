package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Room {
    private String message;
    private LocalDate dateSend = LocalDate.now();
    private Set<Dev> devsInscritos = new HashSet<>();

    private Set<Dev> devMessage = new HashSet<>();

    private Set<Bootcamp> bootcamps = new LinkedHashSet<>();

    private Set<Bootcamp> bootcampsRegistered = new LinkedHashSet<>();
    public void sendMessage(String message, Dev devMessage, Bootcamp bootcampRegistered) {
        this.message = message;
        this.devMessage.add(devMessage);
        this.bootcampsRegistered.add(bootcampRegistered);

        System.out.println(

                        "Bootcamp:"+ bootcampRegistered.getNome() +
                        " Inscritos:"+ bootcampRegistered.getDevsInscritos().size() +
                        " Mensagem: " + message +
                        " Enviada por: " + devMessage.getNome() +
                        " Em: " + this.dateSend
        );

    }
    public Set<Bootcamp> getBootcampsRegistered() {
        return bootcampsRegistered;
    }

    public void setBootcampsRegistered(Set<Bootcamp> bootcampsRegistered) {
        this.bootcampsRegistered = bootcampsRegistered;
    }


    public Set<Dev> getDevMessage() {
        return devMessage;
    }

    public void setDevMessage(Set<Dev> devMessage) {
        this.devMessage = devMessage;
    }

    public Set<Bootcamp> getBootcamps() {
        return bootcamps;
    }

    public void setBootcamps(Set<Bootcamp> bootcamp) {
        this.bootcamps = bootcamp;
    }


    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDateSend() {
        return dateSend;
    }

    public void setDateSend(LocalDate dateSend) {
        this.dateSend = dateSend;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(message, room.message) && Objects.equals(dateSend, room.dateSend) && Objects.equals(devsInscritos, room.devsInscritos) && Objects.equals(devMessage, room.devMessage) && Objects.equals(bootcamps, room.bootcamps) && Objects.equals(bootcampsRegistered, room.bootcampsRegistered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, dateSend, devsInscritos, devMessage, bootcamps, bootcampsRegistered);
    }


}
