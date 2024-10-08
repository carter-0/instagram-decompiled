package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

public final class CH4 extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C321086tY A01;

    public CH4(C321086tY r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C250663lr requiredTreeField;
        ImmutableList requiredCompactedTreeListField;
        C250663lr requiredTreeField2;
        String str;
        C318046oG r0;
        C250663lr r02;
        int A03 = AnonymousClass0fD.A03(829703252);
        AnonymousClass3JC r1 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(773951537);
        0qQ.A0B(r1, 0);
        C250663lr r6 = (C250663lr) r1.A01;
        if (!(r6 == null || (requiredTreeField = r6.getRequiredTreeField(0, C273654mx.A00(1015), C42307BYy.class, 1561923310)) == null || (requiredCompactedTreeListField = requiredTreeField.getRequiredCompactedTreeListField(0, "sections(sections:[\"CUTOUT_STICKER\"])", C42306BYx.class, 236611199)) == null)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((C250663lr) next).getRequiredEnumField(0, "section_type", HNG.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == HNG.CUTOUT_STICKER) {
                    A1C.add(next);
                }
            }
            C250663lr r7 = (C250663lr) 00k.A0J(A1C);
            if (!(r7 == null || (requiredTreeField2 = r7.getRequiredTreeField(1, "items(after:$after,first:$sticker_count_limit)", C42305BYw.class, -131762000)) == null)) {
                ImmutableList requiredCompactedTreeListField2 = requiredTreeField2.getRequiredCompactedTreeListField(0, "edges", C42303BYu.class, 1119921899);
                if (requiredCompactedTreeListField2 != null) {
                    ArrayList A0p = AnonymousClass7TF.A0p(requiredCompactedTreeListField2);
                    Iterator it2 = requiredCompactedTreeListField2.iterator();
                    while (it2.hasNext()) {
                        C250663lr optionalTreeField = C41845B3m.A0V(it2).getOptionalTreeField(0, "cutout_sticker_info", C42302BYt.class, 1006619949);
                        if (optionalTreeField != null) {
                            r02 = optionalTreeField.getRequiredTreeField(0, AnonymousClass000.A00(278), C42300BYr.class, -1337062749);
                        } else {
                            r02 = null;
                        }
                        A0p.add(r02);
                    }
                    List A0X = 00k.A0X(A0p);
                    ArrayList A0p2 = AnonymousClass7TF.A0p(A0X);
                    Iterator it3 = A0X.iterator();
                    while (it3.hasNext()) {
                        C250663lr A0V = C41845B3m.A0V(it3);
                        C317966o8 A002 = C317966o8.A00(new SimpleImageUrl(A0V.getRequiredStringField(2, "image_url")), A0V.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID), A0V.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID), (float) A0V.getRequiredIntField(5, "image_width"), (float) A0V.getRequiredIntField(6, "image_height"), 1.0f);
                        C317876nz r03 = C317876nz.A0a;
                        String requiredStringField = A0V.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        0qQ.A07(requiredStringField);
                        List A1I = AnonymousClass7TE.A1I(A002);
                        if (0qQ.A0K(A0V.getRequiredStringField(1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), MediaStreamTrack.VIDEO_TRACK_KIND)) {
                            r0 = C318046oG.CUTOUT_VIDEO;
                        } else {
                            r0 = C318046oG.CUTOUT_PHOTO;
                        }
                        C317876nz r10 = new C317876nz(r0, requiredStringField, A1I);
                        r10.A0G = Long.valueOf((long) (A0V.getCoercedDoubleField(7, "sticker_duration") * 1000.0d));
                        A0p2.add(r10);
                    }
                    05G r11 = this.A01.A06;
                    Map map = (Map) r11.getValue();
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    Iterator it4 = A0p2.iterator();
                    while (it4.hasNext()) {
                        C317876nz r72 = (C317876nz) it4.next();
                        String str2 = r72.A0Z;
                        C376649Iu r04 = (C376649Iu) map.get(str2);
                        if (r04 != null) {
                            str = r04.A01;
                        } else {
                            str = null;
                        }
                        A1H.put(str2, new C376649Iu(r72, str));
                    }
                    r11.Epw(0Yt.A04(map, A1H));
                }
                C250663lr requiredTreeField3 = requiredTreeField2.getRequiredTreeField(1, "paging_info", C42304BYv.class, 275716537);
                if (requiredTreeField3 != null) {
                    C321086tY r73 = this.A01;
                    int i = this.A00;
                    if (((Number) r73.A02.getValue()).longValue() > ((long) ((Map) r73.A06.getValue()).size()) && requiredTreeField3.getRequiredBooleanField(1, "more_available")) {
                        r73.A01(i, requiredTreeField3.getOptionalStringField(0, "max_id"));
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-479165736, A032);
        AnonymousClass0fD.A0A(-33630579, A03);
    }
}
