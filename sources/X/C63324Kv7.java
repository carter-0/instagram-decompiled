package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.mediakit.model.MediaKitInsightType;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Kv7  reason: case insensitive filesystem */
public abstract class C63324Kv7 {
    public static final Map A00(C66550MWe mWe) {
        String str;
        Long l;
        String str2;
        ArrayList arrayList;
        String str3;
        C66550MWe mWe2 = mWe;
        ArrayList arrayList2 = null;
        boolean z = false;
        if (mWe == null) {
            return null;
        }
        C61216Jz9 jz9 = (C61216Jz9) mWe2;
        C61221JzE jzE = jz9.A00;
        List list = jzE.A06;
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A30 = C51966G9m.A0t(it).A30();
            if (A30 != null) {
                AnonymousClass7TE.A1Y(A0p, Long.parseLong(A30));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        String str4 = jzE.A02;
        if (str4 == null || (str = 00l.A0C(str4).toString()) == null) {
            str = "";
        }
        String str5 = jzE.A03;
        if (str5 != null) {
            l = 00y.A0n(10, str5);
        } else {
            l = null;
        }
        long parseLong = Long.parseLong(jzE.A01.getId());
        String obj = 00l.A0C(jzE.A05).toString();
        MediaKitVisibility mediaKitVisibility = jzE.A00;
        AnonymousClass7TG.A1S(obj, mediaKitVisibility);
        StringWriter A0v = JTO.A0v();
        15p r8 = AnonymousClass15o.A00;
        17W A0A = r8.A0A(A0v);
        A0A.A0c();
        Iterator A0s = C41845B3m.A0s(A0A, C273654mx.A00(76), A0p);
        while (A0s.hasNext()) {
            JTS.A1J(A0A, A0s);
        }
        A0A.A0Y();
        A0A.A0R(DevServerEntity.COLUMN_DESCRIPTION, str);
        if (l != null) {
            A0A.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l.longValue());
        }
        A0A.A0Q("owner_id", parseLong);
        A0A.A0R(DialogModule.KEY_TITLE, obj);
        A0A.A0R("visibility", mediaKitVisibility.A00);
        String A0k = AnonymousClass7TG.A0k(A0A, A0v);
        0qQ.A07(A0k);
        0eP A1L = AnonymousClass7TE.A1L("summary", A0k);
        List list2 = jz9.A02;
        try {
            StringWriter A0v2 = JTO.A0v();
            17W A0A2 = r8.A0A(A0v2);
            Iterator A0v3 = JTP.A0v(A0A2, list2);
            while (A0v3.hasNext()) {
                C61220JzD jzD = (C61220JzD) ((C66554MWi) A0v3.next());
                List list3 = jzD.A05;
                boolean z2 = false;
                ArrayList arrayList3 = null;
                if (list3 != null) {
                    arrayList = AnonymousClass7TF.A0p(list3);
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass7TE.A1Y(arrayList, Long.parseLong(DbT.A0k(it2).getId()));
                    }
                } else {
                    arrayList = null;
                }
                String str6 = jzD.A02;
                if (str6 != null) {
                    str3 = 00l.A0C(str6).toString();
                } else {
                    str3 = null;
                }
                String str7 = jzD.A03;
                0qQ.A0B(str7, 0);
                Long A0n = 00y.A0n(10, str7);
                List<C66551MWf> list4 = jzD.A06;
                if (list4 != null) {
                    arrayList3 = AnonymousClass7TF.A0p(list4);
                    for (C66551MWf mWf : list4) {
                        arrayList3.add(((C61217JzA) mWf).A00);
                    }
                }
                C61219JzC jzC = jzD.A00;
                if (jzC != null) {
                    z = jzC.A01;
                    List<C66552MWg> list5 = jzC.A00;
                    arrayList2 = AnonymousClass7TF.A0p(list5);
                    for (C66552MWg mWg : list5) {
                        String A302 = ((C61218JzB) mWg).A00.A30();
                        if (A302 != null) {
                            AnonymousClass7TE.A1Y(arrayList2, Long.parseLong(A302));
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    z2 = true;
                }
                String obj2 = 00l.A0C(jzD.A04).toString();
                MediaKitSectionType mediaKitSectionType = jzD.A01;
                C51972G9s.A1E(obj2, mediaKitSectionType);
                A0A2.A0c();
                if (arrayList != null) {
                    Iterator A0s2 = C41845B3m.A0s(A0A2, "accounts", arrayList);
                    while (A0s2.hasNext()) {
                        JTS.A1J(A0A2, A0s2);
                    }
                    A0A2.A0Y();
                }
                if (str3 != null) {
                    A0A2.A0R(DevServerEntity.COLUMN_DESCRIPTION, str3);
                }
                if (A0n != null) {
                    A0A2.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0n.longValue());
                }
                if (arrayList3 != null) {
                    Iterator A0s3 = C41845B3m.A0s(A0A2, "insights", arrayList3);
                    while (A0s3.hasNext()) {
                        MediaKitInsightType mediaKitInsightType = (MediaKitInsightType) A0s3.next();
                        if (mediaKitInsightType != null) {
                            A0A2.A0t(mediaKitInsightType.A00);
                        }
                    }
                    A0A2.A0Y();
                }
                if (z2) {
                    A0A2.A0q("media_posts");
                    A0A2.A0c();
                    A0A2.A0S("hides_likes", z);
                    if (arrayList2 != null) {
                        Iterator A0s4 = C41845B3m.A0s(A0A2, AnonymousClass000.A00(C11152SCh.MAX_FACTORIAL), arrayList2);
                        while (A0s4.hasNext()) {
                            JTS.A1J(A0A2, A0s4);
                        }
                        A0A2.A0Y();
                    }
                    A0A2.A0Z();
                }
                A0A2.A0R(DialogModule.KEY_TITLE, obj2);
                A0A2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, mediaKitSectionType.A00);
                A0A2.A0Z();
            }
            str2 = JTR.A13(A0A2, A0v2);
        } catch (IOException unused) {
            str2 = "";
        }
        return DbY.A0p("sections", str2, A1L);
    }
}
