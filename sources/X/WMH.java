package X;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.List;

public final class WMH implements Y9S {
    public final /* synthetic */ AnonymousClass4OI A00;
    public final /* synthetic */ AnonymousClass4PD A01;

    public WMH(AnonymousClass4OI r1, AnonymousClass4PD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final AnonymousClass4XT[] AM2() {
        String str;
        try {
            Constructor<?> constructor = Class.forName("com.google.android.exoplayer2.extractor.mp3.Mp3Extractor").getConstructor(new Class[0]);
            C255653uU r2 = this.A00.A0K;
            List list = r2.A0I;
            if ((list == null || !list.contains("undefined")) && ((str = r2.A0F) == null || !str.equals("undefined"))) {
                return new AnonymousClass4XT[]{(AnonymousClass4XT) constructor.newInstance(new Object[0])};
            }
            return new AnonymousClass4XT[]{(AnonymousClass4XT) constructor.newInstance(new Object[0]), new Q0O()};
        } catch (Exception e) {
            Log.e("HeroExo2VodInitHelper", "Error while creating Mp3/Mp4 Extractor(s)", e);
            throw new RuntimeException(e);
        }
    }
}
