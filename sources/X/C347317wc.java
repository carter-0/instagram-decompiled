package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7wc  reason: invalid class name and case insensitive filesystem */
public final class C347317wc implements AnonymousClass2Kv {
    public final /* synthetic */ C347307wb A00;
    public final /* synthetic */ C347297wa A01;

    public C347317wc(C347307wb r1, C347297wa r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void invoke(AnonymousClass3JD r32) {
        Object Bny;
        Map map;
        C347727xH r5;
        Object obj;
        Object obj2;
        ImmutableList requiredCompactedTreeListField;
        Object obj3;
        ImmutableList requiredCompactedStringListField;
        String str;
        C250663lr optionalTreeField;
        ImmutableList requiredCompactedTreeListField2;
        Class cls;
        C250663lr reinterpretRequired;
        Enum optionalEnumField;
        if (r32 == null || (Bny = r32.Bny()) == null) {
            this.A00.A00((Throwable) null);
            return;
        }
        C347307wb r2 = this.A00;
        boolean z = false;
        if (r32.B87() != AnonymousClass05K.A00) {
            z = true;
        }
        AnonymousClass89T r0 = r2.A01;
        AnonymousClass89T r30 = r0;
        UserSession userSession = r0.A03;
        int i = r2.A00;
        int i2 = i;
        0qQ.A0B(userSession, 0);
        02m.A0p.markerAnnotate(383656871, i, "is_cached_response", z);
        C250663lr r52 = (C250663lr) Bny;
        if (r52 != null) {
            C347297wa r02 = this.A01;
            C347297wa r28 = r02;
            0qQ.A0B(r02, 1);
            C250663lr optionalTreeField2 = r52.getOptionalTreeField(0, "xcxp_unified_crossposting_configs_root(configs_request:$configs_request)", C347617x6.class, -1341481835);
            if (optionalTreeField2 == null || (optionalTreeField = optionalTreeField2.getOptionalTreeField(0, "content_compatibility_configs_v2", C347627x7.class, 1804415308)) == null || (requiredCompactedTreeListField2 = optionalTreeField.getRequiredCompactedTreeListField(0, "source_native_features", C347637x8.class, 2004488805)) == null) {
                map = 0Yt.A0E();
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C249803kO it = requiredCompactedTreeListField2.iterator();
                0qQ.A07(it);
                while (it.hasNext()) {
                    C250663lr r13 = (C250663lr) it.next();
                    C250663lr optionalTreeField3 = r13.getOptionalTreeField(0, "source_native_feature", C347647x9.class, -1293524737);
                    if (!(optionalTreeField3 == null || (reinterpretRequired = optionalTreeField3.reinterpretRequired(0, cls, -1368888522)) == null || (optionalEnumField = reinterpretRequired.getOptionalEnumField(2, "client_native_feature_id", C347677xC.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null)) {
                        Class<C347687xD> cls2 = C347687xD.class;
                        ImmutableList requiredCompactedTreeListField3 = reinterpretRequired.getRequiredCompactedTreeListField(3, "child_native_feature_configs", cls2, 915880350);
                        0qQ.A07(requiredCompactedTreeListField3);
                        ArrayList arrayList = new ArrayList(0Yv.A1E(requiredCompactedTreeListField3, 10));
                        Iterator it2 = requiredCompactedTreeListField3.iterator();
                        while (it2.hasNext()) {
                            C250663lr r14 = (C250663lr) it2.next();
                            ImmutableList requiredCompactedEnumListField = r14.getRequiredCompactedEnumListField(0, "surfaces", C347697xE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            0qQ.A07(requiredCompactedEnumListField);
                            ImmutableList requiredCompactedTreeListField4 = r14.getRequiredCompactedTreeListField(2, "content_type_controllers", C347707xF.class, 931162307);
                            0qQ.A07(requiredCompactedTreeListField4);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = requiredCompactedTreeListField4.iterator();
                            while (it3.hasNext()) {
                                Enum optionalEnumField2 = ((C250663lr) it3.next()).getOptionalEnumField(0, TraceFieldType.ContentType, AnonymousClass89U.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                if (optionalEnumField2 != null) {
                                    arrayList2.add(optionalEnumField2);
                                }
                            }
                            ImmutableList requiredCompactedTreeListField5 = r14.getRequiredCompactedTreeListField(3, "additional_eligibility_rules", C347717xG.class, 1438146845);
                            0qQ.A07(requiredCompactedTreeListField5);
                            arrayList.add(new C347737xI(r28, (C347727xH) r14.getOptionalEnumField(1, "client_behavior", C347727xH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), requiredCompactedEnumListField, arrayList2, requiredCompactedTreeListField5));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        ImmutableList requiredCompactedTreeListField6 = r13.getRequiredCompactedTreeListField(1, "destination_native_features", C347657xA.class, 2032943103);
                        0qQ.A07(requiredCompactedTreeListField6);
                        ArrayList arrayList4 = new ArrayList(0Yv.A1E(requiredCompactedTreeListField6, 10));
                        Iterator it4 = requiredCompactedTreeListField6.iterator();
                        while (it4.hasNext()) {
                            C250663lr reinterpretRequired2 = ((C250663lr) it4.next()).reinterpretRequired(0, (cls = C347667xB.class), -1368888522);
                            0qQ.A07(reinterpretRequired2);
                            C347297wa r12 = (C347297wa) reinterpretRequired2.getOptionalEnumField(0, "app_name", C347297wa.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            if (r12 != null) {
                                C249803kO it5 = reinterpretRequired2.getRequiredCompactedTreeListField(3, "child_native_feature_configs", cls2, 915880350).iterator();
                                0qQ.A07(it5);
                                while (it5.hasNext()) {
                                    C250663lr r142 = (C250663lr) it5.next();
                                    ImmutableList requiredCompactedEnumListField2 = r142.getRequiredCompactedEnumListField(0, "surfaces", C347697xE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                    0qQ.A07(requiredCompactedEnumListField2);
                                    ImmutableList requiredCompactedTreeListField7 = r142.getRequiredCompactedTreeListField(2, "content_type_controllers", C347707xF.class, 931162307);
                                    0qQ.A07(requiredCompactedTreeListField7);
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it6 = requiredCompactedTreeListField7.iterator();
                                    while (it6.hasNext()) {
                                        Enum optionalEnumField3 = ((C250663lr) it6.next()).getOptionalEnumField(0, TraceFieldType.ContentType, AnonymousClass89U.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                        if (optionalEnumField3 != null) {
                                            arrayList5.add(optionalEnumField3);
                                        }
                                    }
                                    ImmutableList requiredCompactedTreeListField8 = r142.getRequiredCompactedTreeListField(3, "additional_eligibility_rules", C347717xG.class, 1438146845);
                                    0qQ.A07(requiredCompactedTreeListField8);
                                    arrayList3.add(new C347737xI(r12, (C347727xH) r142.getOptionalEnumField(1, "client_behavior", C347727xH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), requiredCompactedEnumListField2, arrayList5, requiredCompactedTreeListField8));
                                }
                            }
                            arrayList4.add(C60340gF.A00);
                        }
                        linkedHashMap.put(optionalEnumField, new C347747xJ(00k.A0a(arrayList), 00k.A0a(arrayList3)));
                    }
                }
                map = 0Yt.A0B(linkedHashMap);
            }
            C347817xQ r22 = new C347817xQ(r28, map);
            AnonymousClass89T r03 = r30;
            r03.A00 = System.currentTimeMillis();
            if (r03.A0A) {
                Integer num = AnonymousClass05K.A01;
                C347677xC r04 = C347677xC.IG_SLIDER_POLL_STICKER;
                C347697xE r4 = C347697xE.STORY;
                C347297wa r1 = C347297wa.FB;
                r30.A06.Epw(new C239793Ih(new C381759cH(num, C347827xR.A00(r22, r1, r04, r4), C347827xR.A00(r22, r1, C347677xC.IG_RESHARED_REELS, r4), C347827xR.A00(r22, r1, C347677xC.IG_PRODUCT_STICKER, r4), C347827xR.A00(r22, r1, C347677xC.IG_LINK_STICKER, r4), C347827xR.A00(r22, r1, C347677xC.IG_QUESTION_STICKER, r4), C347827xR.A00(r22, r1, C347677xC.IG_RESHARED_STORY, r4), C347827xR.A00(r22, r1, C347677xC.IG_MUSIC_STICKER, r4), C347827xR.A00(r22, r1, C347677xC.IG_ADD_YOURS_STICKER, r4))));
            }
            Integer num2 = AnonymousClass05K.A01;
            C347677xC r42 = C347677xC.IG_REMIX;
            C347697xE r05 = C347697xE.REELS;
            C347297wa r15 = C347297wa.FB;
            boolean A002 = C347827xR.A00(r22, r15, r42, r05);
            boolean A003 = C347827xR.A00(r22, r15, C347677xC.IG_REMIX_V2, r05);
            boolean A004 = C347827xR.A00(r22, r15, C347677xC.IG_REELS_AUDIO_XPOST, r05);
            boolean A005 = C347827xR.A00(r22, r15, C347677xC.IG_ADD_YOURS_STICKER, r05);
            boolean A006 = C347827xR.A00(r22, r15, C347677xC.IG_SLIDER_POLL_STICKER, r05);
            boolean A007 = C347827xR.A00(r22, r15, C347677xC.IG_POLL_STICKER, r05);
            boolean A008 = C347827xR.A00(r22, r15, C347677xC.IG_QUIZ_STICKER, r05);
            boolean A009 = C347827xR.A00(r22, r15, C347677xC.IG_QUESTION_STICKER, r05);
            boolean A0010 = C347827xR.A00(r22, r15, C347677xC.IG_BRANDED_CONTENT, r05);
            boolean A0011 = C347827xR.A00(r22, r15, C347677xC.IG_COLLABRATION, r05);
            C347677xC r43 = C347677xC.IG_AUDIENCE_CONTROL;
            boolean A0012 = C347827xR.A00(r22, r15, r43, r05);
            boolean A0013 = C347827xR.A00(r22, r15, r43, r05);
            boolean A0014 = C347827xR.A00(r22, r15, C347677xC.IG_COMMUNITY_CROSSPOSTING, r05);
            boolean A0015 = C347827xR.A00(r22, r15, C347677xC.IG_VISUAL_COMMENT, r05);
            boolean A0016 = C347827xR.A00(r22, r15, C347677xC.IG_PANAVISION, r05);
            C347747xJ r44 = (C347747xJ) r22.A01.get(C347677xC.IG_VIDEO_METADATA);
            Integer num3 = null;
            if (r44 != null) {
                List list = r44.A01;
                boolean z2 = list instanceof Collection;
                if (!z2 || !list.isEmpty()) {
                    Iterator it7 = list.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        C347737xI r23 = (C347737xI) it7.next();
                        if (r23.A00 == C347297wa.IG && r23.A04.contains(r05) && r23.A01 == C347727xH.IGNORE) {
                            break;
                        }
                    }
                }
                if (!z2 || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        C347737xI r24 = (C347737xI) it8.next();
                        if (r24.A00 == C347297wa.IG && r24.A04.contains(r05) && r24.A01 == (r5 = C347727xH.ALLOW)) {
                            List list2 = r44.A00;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it9 = list2.iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        break;
                                    }
                                    C347737xI r25 = (C347737xI) it9.next();
                                    if (r25.A00 == r15 && r25.A04.contains(r05) && r25.A01 == C347727xH.IGNORE) {
                                        break;
                                    }
                                }
                            }
                            Iterator it10 = list2.iterator();
                            while (true) {
                                if (!it10.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it10.next();
                                C347737xI r45 = (C347737xI) obj;
                                if (r45.A00 == r15 && r45.A04.contains(r05) && r45.A01 == r5) {
                                    break;
                                }
                            }
                            C347737xI r26 = (C347737xI) obj;
                            if (r26 != null) {
                                Iterator it11 = r26.A02.iterator();
                                while (true) {
                                    if (!it11.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it11.next();
                                    if (0qQ.A0K(((C250663lr) obj2).getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), "ReelVideoLengthRule")) {
                                        break;
                                    }
                                }
                                C250663lr r06 = (C250663lr) obj2;
                                if (r06 != null && (requiredCompactedTreeListField = r06.getRequiredCompactedTreeListField(2, "settings", C347837xS.class, -1220180966)) != null) {
                                    Iterator it12 = requiredCompactedTreeListField.iterator();
                                    while (true) {
                                        if (!it12.hasNext()) {
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = it12.next();
                                        if (0qQ.A0K(((C250663lr) obj3).getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), "VIDEO_MAX_LENGTH_IN_MS")) {
                                            break;
                                        }
                                    }
                                    C250663lr r07 = (C250663lr) obj3;
                                    if (r07 != null && (requiredCompactedStringListField = r07.getRequiredCompactedStringListField(1, "values")) != null && (str = (String) 00k.A0J(requiredCompactedStringListField)) != null) {
                                        num3 = 00y.A0l(str);
                                    }
                                }
                            }
                        }
                    }
                }
                num3 = 0;
            }
            r30.A04.Epw(new C239793Ih(new C347577x2(num2, 0, num3, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016)));
            C347207wR.A02(i2, 2);
            r30.A01 = false;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
