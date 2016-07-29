import com.sun.corba.se.impl.util.SUNVMCID;
import com.sun.javafx.collections.MappingChange;
import javafx.util.converter.LocalDateTimeStringConverter;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.time.Clock;
import java.time.ZoneId;
import java.time.LocalTime;
import java.time.Instant;

/**
 * @author Hugh Glykod
 */
public class Restaurant {

    Map<DayOfWeek, OpenHour> openHour = new HashMap<DayOfWeek, OpenHour>();

    public Restaurant() {

        OpenHour defaultHours = new OpenHour();

        openHour.put(DayOfWeek.MONDAY, defaultHours);
        openHour.put(DayOfWeek.TUESDAY, defaultHours);
        openHour.put(DayOfWeek.WEDNESDAY, defaultHours);
        openHour.put(DayOfWeek.THURSDAY, defaultHours);
        openHour.put(DayOfWeek.FRIDAY, defaultHours);
        openHour.put(DayOfWeek.SATURDAY, defaultHours);

    }

    Clock.fixed(Instant.parse("2016-01-01T10:00:002"),ZoneId.systemDefault());
    // Je ne sais pas pourquoi il faut la ligne du-dessus.
    // Il aurait fallu avoir un exemple pour comprendre à quoi sert Clock.
    // Je ne peux pas faire de push commit car il y a deserreurs dans mon code.

    Clock clock = Clock.systemDefaultZone();







    private String name;

    public boolean isOpen(DayOfWeek day) {

        if (day == DayOfWeek.MONDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(openHour.get(day).getOpeningHour())))&&
            LocalTime.now().isBefore(LocalTime.parse(openHour.get(day).getClosingHour()));
            {
                return true;
//Je n'ai absolument aucune idée de ce qu'il faut mettre ici.
//le 'else' en rouge dit qu'il n'y a pas de 'if' or il y en a 2 au-dessus. Idem pour les suivants.
            }else{
                return false;
            }
        }
        if (day == DayOfWeek.TUESDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(openHour.get(day).getOpeningHour())))&&
            LocalTime.now().isBefore(LocalTime.parse(openHour.get(day).getClosingHour()));
            {
                return true;
            }else{
                return false;
            }
        }
        if (day == DayOfWeek.WEDNESDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(openHour.get(day).getOpeningHour())))&&
            LocalTime.now().isBefore(LocalTime.parse(openHour.get(day).getClosingHour()));
            {
                return true;
            }else{
                return false;
            }
        }
        if (day == DayOfWeek.THURSDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(openHour.get(day).getOpeningHour())))&&
            LocalTime.now().isBefore(LocalTime.parse(openHour.get(day).getClosingHour()));
            {
                return true;
            }else{
                return false;
            }
        }
        if (day == DayOfWeek.FRIDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(openHour.get(day).getOpeningHour())))&&
            LocalTime.now().isBefore(LocalTime.parse(openHour.get(day).getClosingHour()));
            {
                return true;
            }else{
                return false;
            }
        }
        if (day == DayOfWeek.SATURDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(openHour.get(day).getOpeningHour())))&&
            LocalTime.now().isBefore(LocalTime.parse(openHour.get(day).getClosingHour()));
            {
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

//Je n'ai absolument aucune idée de ce qu'il faut mettre ici à la place de mondayOpen. Idem avec les autres jours.

}


