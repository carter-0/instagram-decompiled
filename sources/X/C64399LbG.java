package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.LbG  reason: case insensitive filesystem */
public final class C64399LbG implements AnonymousClass2Kv {
    public final /* synthetic */ KX0 A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ boolean A06;

    public C64399LbG(KX0 kx0, ImageUrl imageUrl, String str, String str2, String str3, 0sP r6, boolean z) {
        this.A00 = kx0;
        this.A05 = r6;
        this.A06 = z;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = imageUrl;
    }

    public final void invoke(AnonymousClass3JD r41) {
        C250663lr A0U;
        C43173Btx btx;
        C43347Bwl bwl;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        boolean z;
        ArrayList arrayList;
        boolean z2;
        Object value;
        C61061Jvz jvz;
        String str;
        C61061Jvz jvz2;
        Object value2;
        C61061Jvz jvz3;
        C250663lr A012;
        C250663lr reinterpretIfFulfillsType;
        C250663lr A013;
        ImmutableList requiredCompactedTreeListField;
        KX0 kx0 = this.A00;
        05G r39 = kx0.A0V;
        if (!(r39.getValue() instanceof C64471LcY)) {
            AnonymousClass0eM r38 = kx0.A09;
            JTO.A0U(r38).A05("quick_create_response_received");
            if (!(r41 == null || (A0U = C41845B3m.A0U(r41)) == null)) {
                C8C c8c = (C8C) A0U.getOptionalTreeField(0, AnonymousClass000.A00(1962), C8C.class, 1063412699);
                if (c8c != null) {
                    String optionalStringField = c8c.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    C43323BwN A0E = c8c.A0E();
                    if (A0E != null) {
                        btx = (C43173Btx) A0E.A01(C43173Btx.class, -1227888073);
                    } else {
                        btx = null;
                    }
                    if (!(optionalStringField == null || btx == null)) {
                        C43323BwN A0E2 = c8c.A0E();
                        if (A0E2 != null) {
                            bwl = JTS.A0R(A0E2, 1);
                        } else {
                            bwl = null;
                        }
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        if (bwl == null || (immutableList = bwl.getRequiredCompactedTreeListField(2, AnonymousClass000.A00(577), C8H.class, 728213440)) == null) {
                            immutableList = 0sn.A00;
                        }
                        ArrayList A1C2 = AnonymousClass7TE.A1C();
                        for (Object next : immutableList) {
                            C8H c8h = (C8H) next;
                            if (!(c8h.getOptionalStringField(1, "app_formatted") == null || c8h.A0E() == null)) {
                                A1C2.add(next);
                            }
                        }
                        Iterator it = A1C2.iterator();
                        while (it.hasNext()) {
                            C8H c8h2 = (C8H) it.next();
                            String valueOf = String.valueOf(c8h2.getOptionalStringField(1, "app_formatted"));
                            String A09 = c8h2.A09("app_subtext");
                            C62608Kif A0E3 = c8h2.A0E();
                            if (A0E3 != null) {
                                A1C.add(new C61055Jvt(A0E3, valueOf, A09, c8h2.getCoercedBooleanField(3, "is_enabled")));
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                        UserSession userSession = kx0.A03;
                        UserSession userSession2 = userSession;
                        0Tu r15 = 0Tu.A05;
                        boolean A062 = 182.A06(r15, userSession, 36324076024246034L);
                        String A0A = btx.A0A("profile_image_url");
                        if (A062 && A0A == null) {
                            A0A = btx.A0B(AnonymousClass000.A00(377));
                        }
                        05G r14 = kx0.A0D;
                        if (bwl == null || (immutableList2 = bwl.getRequiredCompactedTreeListField(1, AnonymousClass000.A00(517), C43346Bwk.class, 1443740561)) == null) {
                            immutableList2 = 0sn.A00;
                        }
                        ArrayList A1C3 = AnonymousClass7TE.A1C();
                        Iterator it2 = immutableList2.iterator();
                        while (it2.hasNext()) {
                            JTT.A1V(A1C3, it2);
                        }
                        int A0L = 0se.A0L(0Yv.A1E(A1C3, 10));
                        if (A0L < 16) {
                            A0L = 16;
                        }
                        LinkedHashMap A0x = DbS.A0x(A0L);
                        Iterator it3 = A1C3.iterator();
                        while (it3.hasNext()) {
                            C43346Bwk bwk = (C43346Bwk) it3.next();
                            String optionalStringField2 = bwk.getOptionalStringField(1, "audience_formatted");
                            if (optionalStringField2 != null) {
                                C62626Kix kix = (C62626Kix) bwk.getOptionalEnumField(0, "audience_enum", C62626Kix.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                if (kix != null) {
                                    A0x.put(optionalStringField2, kix);
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                        r14.Epw(A0x);
                        05G r0 = kx0.A0C;
                        String A002 = KX0.A00(kx0, bwl);
                        C250663lr reinterpretIfFulfillsType2 = c8c.reinterpretIfFulfillsType(1, "XIGGenAIPersona", C43348Bwm.class, -546124400);
                        if (reinterpretIfFulfillsType2 != null) {
                            z = reinterpretIfFulfillsType2.getCoercedBooleanField(0, "show_in_ig_profile_banner");
                        } else {
                            z = false;
                        }
                        List A0a = 00k.A0a(A1C);
                        List A1P = 0sr.A1P(new String[]{"", "", ""});
                        C43323BwN A0E4 = c8c.A0E();
                        if (A0E4 == null || (A013 = A0E4.A01(C43173Btx.class, -1227888073)) == null || (requiredCompactedTreeListField = A013.getRequiredCompactedTreeListField(16, "capability_options", C43172Btw.class, 1636999611)) == null) {
                            arrayList = 0sn.A00;
                        } else {
                            arrayList = AnonymousClass7TE.A1C();
                            Iterator it4 = requiredCompactedTreeListField.iterator();
                            while (it4.hasNext()) {
                                C250663lr A0V = C41845B3m.A0V(it4);
                                arrayList.add(new GSY((Object) A0V.getOptionalEnumField(3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C62607Kie.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), (Object) C41846B3n.A0d(A0V, "is_enabled", 1), A0V.getOptionalStringField(2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), A0V.getOptionalStringField(0, DevServerEntity.COLUMN_DESCRIPTION), 1));
                            }
                        }
                        C43323BwN A0E5 = c8c.A0E();
                        if (A0E5 == null || (A012 = A0E5.A01(C43173Btx.class, -1227888073)) == null || (reinterpretIfFulfillsType = A012.reinterpretIfFulfillsType(17, "XIGGenAIPersonaVersion", C43354Bws.class, 277338709)) == null) {
                            z2 = false;
                        } else {
                            z2 = reinterpretIfFulfillsType.getCoercedBooleanField(0, AnonymousClass000.A00(597));
                        }
                        r0.Epw(C63004Kpu.A00((C61073JwB) null, (C62629Kj0) null, btx, optionalStringField, A002, A0a, (List) null, A1P, arrayList, z, z2));
                        if (182.A06(r15, userSession2, 36324076024246034L)) {
                            do {
                                value2 = r0.getValue();
                                C61061Jvz jvz4 = (C61061Jvz) value2;
                                if (jvz4 != null) {
                                    jvz3 = C61061Jvz.A00((C61073JwB) null, jvz4, DbS.A0V(A0A), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, JTS.A0r(kx0.A0c), (List) null, (List) null, (List) null, (List) null, 8372191, false, false);
                                } else {
                                    jvz3 = null;
                                }
                            } while (!r0.AIY(value2, jvz3));
                        } else {
                            do {
                                value = r0.getValue();
                                C61061Jvz jvz5 = (C61061Jvz) value;
                                if (jvz5 != null) {
                                    jvz = C61061Jvz.A00((C61073JwB) null, jvz5, (ImageUrl) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, JTS.A0r(kx0.A0c), (List) null, (List) null, (List) null, (List) null, 8372223, false, false);
                                } else {
                                    jvz = null;
                                }
                            } while (!r0.AIY(value, jvz));
                        }
                        05G r3 = kx0.A0E;
                        AnonymousClass0Ud r5 = kx0.A0b;
                        r3.Epw(r5.getValue());
                        05G r32 = kx0.A0X;
                        C61061Jvz A0V2 = JTO.A0V(r5);
                        if (A0V2 != null) {
                            str = A0V2.A08;
                        } else {
                            str = null;
                        }
                        r32.Epw(String.valueOf(str));
                        if (this.A06) {
                            C61061Jvz jvz6 = (C61061Jvz) r0.getValue();
                            if (jvz6 != null) {
                                String str2 = this.A03;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str3 = this.A02;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                String str4 = this.A04;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String optionalStringField3 = btx.getOptionalStringField(7, "image_prompt");
                                if (optionalStringField3 == null) {
                                    optionalStringField3 = "";
                                }
                                jvz2 = C61061Jvz.A00((C61073JwB) null, jvz6, this.A01, (String) null, str2, str3, optionalStringField3, (String) null, str4, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 8388291, false, false);
                            } else {
                                jvz2 = null;
                            }
                            r0.Epw(jvz2);
                            JTT.A1X(r0, kx0.A0W);
                            AnonymousClass7I6 A0U2 = JTO.A0U(r38);
                            Integer num = AnonymousClass05K.A00;
                            A0U2.A03(num);
                            Object value3 = r5.getValue();
                            if (value3 != null) {
                                r39.Epw(new C64471LcY((C61061Jvz) value3));
                                JTO.A0U(r38).A05("light_weight_quick_creation_completed");
                                JTO.A0U(r38).A03(num);
                                return;
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        } else if (A0A != null) {
                            JTO.A0U(r38).A05("quick_create_image_gen_completed");
                            JTT.A1X(r0, kx0.A0W);
                            JTO.A0U(r38).A03(AnonymousClass05K.A00);
                            Object value4 = r5.getValue();
                            if (value4 != null) {
                                r39.Epw(new C64471LcY((C61061Jvz) value4));
                                return;
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        } else {
                            KX0.A03(kx0);
                            return;
                        }
                    }
                }
            }
            this.A05.invoke(AnonymousClass7TE.A15(AnonymousClass000.A00(460)));
        }
    }
}
