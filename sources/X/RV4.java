package X;

public abstract class RV4 {
    public static Enum A00(Class cls, String str) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            for (Enum enumR : enumArr) {
                if (enumR.name().equalsIgnoreCase(str)) {
                    return enumR;
                }
            }
        }
        return null;
    }
}
