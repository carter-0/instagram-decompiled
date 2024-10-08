package X;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.lang.reflect.Type;

public final class Q2A implements C13657TeO, C13658TeP {
    public final /* bridge */ /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, C13491TbI tbI) {
        String str;
        AutoplayWhichVideos.Companion companion = AutoplayWhichVideos.Companion;
        if (jsonElement == null || (str = jsonElement.getAsString()) == null) {
            str = "";
        }
        return companion.valueOf(str);
    }

    public final /* bridge */ /* synthetic */ JsonElement serialize(Object obj, Type type, C13492TbJ tbJ) {
        return new JsonPrimitive(DbX.A0t(obj));
    }
}
