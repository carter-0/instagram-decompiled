package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreateModeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CWS {
    public static Map A00(AnonymousClass5OM r5) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (r5.Alk() != null) {
            List<DT8> Alk = r5.Alk();
            if (Alk != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (DT8 dt8 : Alk) {
                    if (dt8 != null) {
                        arrayList2.add(dt8.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("cards", arrayList2);
        }
        List B8Z = r5.B8Z();
        if (B8Z != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(B8Z);
            Iterator it = B8Z.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("fundraiser_sticker_suggestions", A0r);
        }
        if (r5.B9H() != null) {
            C46278DTh B9H = r5.B9H();
            if (B9H != null) {
                treeUpdaterJNI3 = B9H.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("gifs_info", treeUpdaterJNI3);
        }
        if (r5.BA8() != null) {
            C46238DRt BA8 = r5.BA8();
            if (BA8 != null) {
                treeUpdaterJNI2 = BA8.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("group_poll_info", treeUpdaterJNI2);
        }
        if (r5.getName() != null) {
            C41845B3m.A0z(r5.getName(), A1H);
        }
        if (r5.BdY() != null) {
            List<DTK> BdY = r5.BdY();
            if (BdY != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DTK dtk : BdY) {
                    if (dtk != null) {
                        arrayList.add(dtk.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("poll_stickers", arrayList);
        }
        if (r5.C4f() != null) {
            DT7 C4f = r5.C4f();
            if (C4f != null) {
                treeUpdaterJNI = C4f.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("templates_info", treeUpdaterJNI);
        }
        if (r5.C75() != null) {
            A1H.put("thumbnail_url", r5.C75());
        }
        if (r5.CAL() != null) {
            CreateModeType CAL = r5.CAL();
            if (CAL != null) {
                str = CAL.A00;
            }
            C41845B3m.A11(str, A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
