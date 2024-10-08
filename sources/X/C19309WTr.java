package X;

import android.net.NetworkInfo;
import java.util.Map;

/* renamed from: X.WTr  reason: case insensitive filesystem */
public final class C19309WTr implements AnonymousClass0qK {
    public final /* synthetic */ UI6 A00;

    public C19309WTr(UI6 ui6) {
        this.A00 = ui6;
    }

    public final void onConnectionChanged(NetworkInfo networkInfo) {
        String typeName;
        C16482Uvc uvc;
        if (networkInfo != null) {
            networkInfo.getTypeName();
            networkInfo.getSubtypeName();
            String typeName2 = networkInfo.getTypeName();
            if (typeName2 != null && typeName2.length() != 0) {
                String subtypeName = networkInfo.getSubtypeName();
                if (subtypeName == null || subtypeName.length() == 0) {
                    typeName = networkInfo.getTypeName();
                } else {
                    String typeName3 = networkInfo.getTypeName();
                    String subtypeName2 = networkInfo.getSubtypeName();
                    0qQ.A07(subtypeName2);
                    String replace = subtypeName2.replace('.', '_');
                    0qQ.A07(replace);
                    String replace2 = replace.replace(' ', '_');
                    0qQ.A07(replace2);
                    typeName = 002.A0T(typeName3, replace2, '.');
                }
                if (typeName != null) {
                    UI6 ui6 = this.A00;
                    if (182.A06(0Tu.A05, ui6.A02.A00, 36317672224789946L) && !typeName.equals(ui6.A00)) {
                        UL7 ul7 = ui6.A04.A04;
                        Object obj = VKW.A00.get(typeName);
                        if (obj == null) {
                            obj = C16556Ux8.OTHERS;
                        }
                        String str = ((C16556Ux8) obj).A00;
                        0qQ.A0B(str, 0);
                        Map map = ul7.A00;
                        if (map == null || !map.containsKey(str)) {
                            ui6.A00 = typeName;
                            if (ui6.A01) {
                                uvc = C16482Uvc.A04;
                            } else {
                                uvc = C16482Uvc.A06;
                            }
                            ui6.A03.A00();
                            ui6.A01(uvc, (String) null);
                        }
                    }
                    ui6.A01 = false;
                    ui6.A00 = typeName;
                }
            }
        }
    }
}
