package X;

import com.instagram.api.schemas.IGAdProfileProductTabDictImpl;
import com.instagram.api.schemas.IGAdProfileProductTabFeatureModeEnum;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CYh  reason: case insensitive filesystem */
public abstract class C44168CYh {
    public static IGAdProfileProductTabDictImpl parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum = null;
            Boolean bool = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (AnonymousClass000.A00(1347).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    iGAdProfileProductTabFeatureModeEnum = (IGAdProfileProductTabFeatureModeEnum) IGAdProfileProductTabFeatureModeEnum.A01.get(str);
                    if (iGAdProfileProductTabFeatureModeEnum == null) {
                        iGAdProfileProductTabFeatureModeEnum = IGAdProfileProductTabFeatureModeEnum.UNRECOGNIZED;
                    }
                } else if (AnonymousClass000.A00(1522).equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if (AnonymousClass000.A00(323).equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r7);
                } else if ("products".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C41846B3n.A1G(r7, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r7.A0z();
            }
            return new IGAdProfileProductTabDictImpl(iGAdProfileProductTabFeatureModeEnum, bool, bool2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
