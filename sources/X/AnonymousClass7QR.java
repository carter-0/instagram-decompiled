package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.7QR  reason: invalid class name */
public final class AnonymousClass7QR {
    public final C333617Zq A00;

    public static final C60939Jtx A00(C43292Bvs bvs) {
        String A07 = bvs.A07("video_id");
        String A0A = bvs.A0A("sd_progressive_url");
        String A09 = bvs.A09("hd_progressive_url");
        if (A07 == null || A0A == null || A09 == null) {
            return null;
        }
        return new C60939Jtx((long) bvs.getCoercedIntField(4, "duration_ms"), A07, A0A, A09, bvs.A08("dash_manifest"), (long) bvs.getCoercedIntField(5, "expiry"));
    }

    public static final C61072JwA A01(C43133BtJ btJ) {
        int i;
        int i2;
        int i3;
        C48121EWn eWn = (C48121EWn) btJ.getOptionalEnumField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, C48121EWn.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (eWn != null) {
            i = eWn.ordinal();
        } else {
            i = -1;
        }
        ImmutableList requiredCompactedTreeListField = btJ.getRequiredCompactedTreeListField(1, "intensities", C43132BtI.class, 269461125);
        0qQ.A07(requiredCompactedTreeListField);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = requiredCompactedTreeListField.iterator();
        while (it.hasNext()) {
            C250663lr r3 = (C250663lr) it.next();
            C391329si r1 = C391329si.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            C391329si r0 = (C391329si) r3.getOptionalEnumField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r1);
            if (r0 != null) {
                i2 = r0.ordinal();
            } else {
                i2 = -1;
            }
            Integer valueOf = Integer.valueOf(i2);
            C391329si r02 = (C391329si) r3.getOptionalEnumField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r1);
            if (r02 != null) {
                i3 = r02.ordinal();
            } else {
                i3 = -1;
            }
            ImmutableList requiredCompactedTreeListField2 = r3.getRequiredCompactedTreeListField(1, "videos", C43131BtH.class, 1216364187);
            0qQ.A07(requiredCompactedTreeListField2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = requiredCompactedTreeListField2.iterator();
            while (it2.hasNext()) {
                C43292Bvs bvs = (C43292Bvs) ((C250663lr) it2.next()).reinterpretRequired(0, C43292Bvs.class, -1940125461);
                0qQ.A07(bvs);
                C60939Jtx A002 = A00(bvs);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
            linkedHashMap.put(valueOf, new C61065Jw3((List) 00k.A0U(arrayList), i3, 0, 0));
        }
        return new C61072JwA(i, 0, (Object) linkedHashMap);
    }

    public AnonymousClass7QR(C333617Zq r1) {
        this.A00 = r1;
    }
}
