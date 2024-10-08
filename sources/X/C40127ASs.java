package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ASs  reason: case insensitive filesystem */
public final class C40127ASs implements AnonymousClass2Kv {
    public final /* synthetic */ C361588gT A00;

    public C40127ASs(C361588gT r1) {
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r26) {
        List list;
        C250663lr r3;
        C250663lr optionalTreeField;
        C250663lr requiredTreeField;
        ImmutableList requiredCompactedTreeListField;
        String str;
        AnonymousClass9JL r0;
        Integer num;
        ImmutableList requiredCompactedTreeListField2;
        C250663lr r11;
        C250663lr reinterpretIfFulfillsType;
        C391339sj A02 = AJ5.A02(r26);
        C391339sj r1 = C391339sj.OPTED_IN;
        05G r4 = this.A00.A03;
        if (A02 == r1) {
            C391339sj A022 = AJ5.A02(r26);
            if (!(r26 == null || (r3 = (C250663lr) r26.Bny()) == null || (optionalTreeField = r3.getOptionalTreeField(0, "meta_gallery", C42510Bdr.class, -1545310103)) == null || (requiredTreeField = optionalTreeField.getRequiredTreeField(1, AnonymousClass000.A00(2592), C42509Bdq.class, 1033643324)) == null || (requiredCompactedTreeListField = requiredTreeField.getRequiredCompactedTreeListField(0, "nodes", C42508Bdp.class, 1747410905)) == null)) {
                ArrayList A0r = AnonymousClass7TG.A0r(requiredCompactedTreeListField);
                Iterator it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    C250663lr r10 = (C250663lr) it.next();
                    0qQ.A0A(r10);
                    Class<C42507Bdo> cls = C42507Bdo.class;
                    String A002 = AnonymousClass000.A00(2657);
                    C250663lr optionalTreeField2 = r10.getOptionalTreeField(4, A002, cls, -214999150);
                    if (!(optionalTreeField2 == null || (requiredCompactedTreeListField2 = optionalTreeField2.getRequiredCompactedTreeListField(1, "nodes", C42506Bdn.class, -1309324893)) == null)) {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        Iterator it2 = requiredCompactedTreeListField2.iterator();
                        while (it2.hasNext()) {
                            C250663lr r14 = (C250663lr) it2.next();
                            C250663lr reinterpretIfFulfillsType2 = r14.reinterpretIfFulfillsType(0, AnonymousClass000.A00(4376), C42516Bdx.class, 1869172584);
                            if (!((reinterpretIfFulfillsType2 == null || (r11 = reinterpretIfFulfillsType2.A01(C383579fo.class, -851351358)) == null) && ((reinterpretIfFulfillsType = r14.reinterpretIfFulfillsType(1, AnonymousClass000.A00(4377), C42517Bdy.class, -1506827412)) == null || (r11 = reinterpretIfFulfillsType.A01(C383579fo.class, -851351358)) == null))) {
                                A1C.add(new SimpleImageUrl(r11.getOptionalStringField(4, "thumbnail")));
                            }
                        }
                        Iterator it3 = A1C.iterator();
                        while (it3.hasNext()) {
                            1OO A0J = 1NK.A00().A0J((ImageUrl) it3.next(), "MetaGalleryUtils");
                            A0J.A0I = true;
                            A0J.A0L = true;
                            A0J.A01();
                        }
                    }
                    String A07 = r10.A07("strong_id__");
                    String optionalStringField = r10.getOptionalStringField(2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    C391269sc r02 = (C391269sc) r10.getOptionalEnumField(1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C391269sc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (r02 != null) {
                        int ordinal = r02.ordinal();
                        if (ordinal == 2) {
                            str = "HORIZON";
                        } else if (ordinal == 4) {
                            str = "OCULUS";
                        }
                        if (A07 != null || optionalStringField == null || str == null || A022 == null) {
                            r0 = null;
                        } else {
                            String A0A = r10.A0A("thumbnail");
                            C250663lr optionalTreeField3 = r10.getOptionalTreeField(4, A002, cls, -214999150);
                            if (optionalTreeField3 != null) {
                                num = Integer.valueOf(optionalTreeField3.getCoercedIntField(0, "count"));
                            } else {
                                num = null;
                            }
                            r0 = new AnonymousClass9JL(A022, num, A07, optionalStringField, str, A0A);
                        }
                        A0r.add(r0);
                    }
                    str = null;
                    if (A07 != null) {
                    }
                    r0 = null;
                    A0r.add(r0);
                }
                list = 00k.A0X(A0r);
                r4.Epw(list);
            }
        }
        list = 0sn.A00;
        r4.Epw(list);
    }
}
