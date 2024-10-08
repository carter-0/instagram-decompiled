package com.instagram.aistudio.editor;

import X.00k;
import X.05G;
import X.0Tu;
import X.0Yv;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.0sP;
import X.0se;
import X.0sn;
import X.0sr;
import X.182;
import X.1Hj;
import X.1vn;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass1EO;
import X.AnonymousClass1Ek;
import X.AnonymousClass3JC;
import X.AnonymousClass4D7;
import X.AnonymousClass7I6;
import X.AnonymousClass7TE;
import X.C239793Ih;
import X.C239803Ii;
import X.C250663lr;
import X.C297815sO;
import X.C41845B3m;
import X.C41846B3n;
import X.C43172Btw;
import X.C43173Btx;
import X.C43323BwN;
import X.C43346Bwk;
import X.C43347Bwl;
import X.C43348Bwm;
import X.C43354Bws;
import X.C51967G9n;
import X.C60340gF;
import X.C61055Jvt;
import X.C61061Jvz;
import X.C61073JwB;
import X.C62607Kie;
import X.C62608Kif;
import X.C62626Kix;
import X.C62629Kj0;
import X.C63004Kpu;
import X.C64091Eg;
import X.C64471LcY;
import X.C64472LcZ;
import X.C8C;
import X.C8H;
import X.DbS;
import X.GSY;
import X.JTO;
import X.JTP;
import X.JTS;
import X.JTT;
import X.KX0;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.aistudio.editor.AiCreationRepositoryV2$quickCreateAi$2", f = "AiCreationRepositoryV2.kt", i = {}, l = {287}, m = "invokeSuspend", n = {}, s = {})
public final class AiCreationRepositoryV2$quickCreateAi$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ C64091Eg A01;
    public final /* synthetic */ KX0 A02;
    public final /* synthetic */ ImageUrl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiCreationRepositoryV2$quickCreateAi$2(C64091Eg r2, KX0 kx0, ImageUrl imageUrl, String str, String str2, String str3, String str4, AnonymousClass4D7 r9, 0sP r10, boolean z) {
        super(2, r9);
        this.A02 = kx0;
        this.A04 = str;
        this.A01 = r2;
        this.A08 = r10;
        this.A09 = z;
        this.A06 = str2;
        this.A05 = str3;
        this.A07 = str4;
        this.A03 = imageUrl;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.aistudio.editor.AiCreationRepositoryV2$quickCreateAi$2] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        KX0 kx0 = this.A02;
        String str = this.A04;
        C64091Eg r1 = this.A01;
        0sP r9 = this.A08;
        boolean z = this.A09;
        return new AiCreationRepositoryV2$quickCreateAi$2(r1, kx0, this.A03, str, this.A06, this.A05, this.A07, r13, r9, z);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.4D7, com.instagram.aistudio.editor.AiCreationRepositoryV2$quickCreateAi$2] */
    public final Object invokeSuspend(Object obj) {
        C250663lr r7;
        C43173Btx btx;
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
        Object obj2 = obj;
        Object obj3 = 1Hj.A02;
        C43347Bwl bwl = null;
        if (this.A00 != 0) {
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            KX0 kx0 = this.A02;
            kx0.A0V.Epw(new C64472LcZ((AnonymousClass1EO) null, this.A04));
            1vn r1 = kx0.A04;
            C64091Eg r0 = this.A01;
            0qQ.A0A(r0);
            this.A00 = 1;
            obj2 = r1.A04(r0, this);
            if (obj2 == obj3) {
                return obj3;
            }
        }
        Object obj4 = (C239803Ii) obj2;
        KX0 kx02 = this.A02;
        0sP r3 = this.A08;
        boolean z3 = this.A09;
        String str2 = this.A06;
        String str3 = this.A05;
        String str4 = this.A07;
        ImageUrl imageUrl = this.A03;
        if (obj4 instanceof C239793Ih) {
            AnonymousClass3JC r4 = (AnonymousClass3JC) ((C239793Ih) obj4).A00;
            05G r42 = kx02.A0V;
            if (!(r42.getValue() instanceof C64471LcY)) {
                AnonymousClass0eM r41 = kx02.A09;
                JTO.A0U(r41).A05("quick_create_response_received");
                if (!(r4 == null || (r7 = (C250663lr) r4.A01) == null)) {
                    C8C c8c = (C8C) r7.getOptionalTreeField(0, AnonymousClass000.A00(1962), C8C.class, 1063412699);
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
                                String A092 = c8h2.A09("app_subtext");
                                C62608Kif A0E3 = c8h2.A0E();
                                if (A0E3 != null) {
                                    A1C.add(new C61055Jvt(A0E3, valueOf, A092, c8h2.getCoercedBooleanField(3, "is_enabled")));
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            }
                            UserSession userSession = kx02.A03;
                            UserSession userSession2 = userSession;
                            0Tu r18 = 0Tu.A05;
                            boolean A062 = 182.A06(r18, userSession, 36324076024246034L);
                            String A0A = btx.A0A("profile_image_url");
                            if (A062 && A0A == null) {
                                A0A = btx.A0B(AnonymousClass000.A00(377));
                            }
                            05G r12 = kx02.A0D;
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
                            r12.Epw(A0x);
                            05G r02 = kx02.A0C;
                            String A002 = KX0.A00(kx02, bwl);
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
                            r02.Epw(C63004Kpu.A00((C61073JwB) null, (C62629Kj0) null, btx, optionalStringField, A002, A0a, (List) null, A1P, arrayList, z, z2));
                            if (182.A06(r18, userSession2, 36324076024246034L)) {
                                do {
                                    value2 = r02.getValue();
                                    C61061Jvz jvz4 = (C61061Jvz) value2;
                                    if (jvz4 != null) {
                                        jvz3 = C61061Jvz.A00((C61073JwB) null, jvz4, DbS.A0V(A0A), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, JTS.A0r(kx02.A0c), (List) null, (List) null, (List) null, (List) null, 8372191, false, false);
                                    } else {
                                        jvz3 = null;
                                    }
                                } while (!r02.AIY(value2, jvz3));
                            } else {
                                do {
                                    value = r02.getValue();
                                    C61061Jvz jvz5 = (C61061Jvz) value;
                                    if (jvz5 != null) {
                                        jvz = C61061Jvz.A00((C61073JwB) null, jvz5, (ImageUrl) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, JTS.A0r(kx02.A0c), (List) null, (List) null, (List) null, (List) null, 8372223, false, false);
                                    } else {
                                        jvz = null;
                                    }
                                } while (!r02.AIY(value, jvz));
                            }
                            05G r72 = kx02.A0E;
                            AnonymousClass0Ud r5 = kx02.A0b;
                            r72.Epw(r5.getValue());
                            05G r73 = kx02.A0X;
                            C61061Jvz A0V2 = JTO.A0V(r5);
                            if (A0V2 != null) {
                                str = A0V2.A08;
                            } else {
                                str = null;
                            }
                            r73.Epw(String.valueOf(str));
                            if (z3) {
                                C61061Jvz A0M = JTP.A0M(r02);
                                if (A0M != null) {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    String optionalStringField3 = btx.getOptionalStringField(7, "image_prompt");
                                    if (optionalStringField3 == null) {
                                        optionalStringField3 = "";
                                    }
                                    jvz2 = C61061Jvz.A00((C61073JwB) null, A0M, imageUrl, (String) null, str2, str3, optionalStringField3, (String) null, str4, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 8388291, false, false);
                                } else {
                                    jvz2 = null;
                                }
                                r02.Epw(jvz2);
                                JTT.A1X(r02, kx02.A0W);
                                AnonymousClass7I6 A0U = JTO.A0U(r41);
                                Integer num = AnonymousClass05K.A00;
                                A0U.A03(num);
                                Object value3 = r5.getValue();
                                if (value3 != null) {
                                    r42.Epw(new C64471LcY((C61061Jvz) value3));
                                    JTO.A0U(r41).A05("light_weight_quick_creation_completed");
                                    JTO.A0U(r41).A03(num);
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else if (A0A != null) {
                                JTO.A0U(r41).A05("quick_create_image_gen_completed");
                                JTT.A1X(r02, kx02.A0W);
                                JTO.A0U(r41).A03(AnonymousClass05K.A00);
                                Object value4 = r5.getValue();
                                if (value4 != null) {
                                    r42.Epw(new C64471LcY((C61061Jvz) value4));
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                KX0.A03(kx02);
                            }
                        }
                    }
                }
                r3.invoke(AnonymousClass7TE.A15(AnonymousClass000.A00(460)));
            }
            obj4 = C51967G9n.A0d();
        } else if (!(obj4 instanceof C297815sO)) {
            throw AnonymousClass7TE.A1K();
        }
        if ((obj4 instanceof C239793Ih) || (obj4 instanceof C297815sO)) {
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiCreationRepositoryV2$quickCreateAi$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
