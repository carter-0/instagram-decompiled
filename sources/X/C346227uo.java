package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7uo  reason: invalid class name and case insensitive filesystem */
public final class C346227uo {
    /* JADX WARNING: type inference failed for: r0v11, types: [X.7yg, X.3FZ] */
    public static final boolean A04(C348527yb r8) {
        StringBuilder sb;
        StringBuilder sb2;
        int i;
        AnonymousClass3FZ A00;
        String A05;
        Object obj;
        if (r8.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID) == null) {
            sb = new StringBuilder();
            sb.append(AnonymousClass000.A00(1007));
            obj = r8;
        } else {
            Class<C348537yc> cls = C348537yc.class;
            AnonymousClass3FZ A002 = r8.A00(cls, "thumbnail_image");
            if (A002 == null || A002.A05("uri") == null) {
                sb = new StringBuilder();
                sb.append(AnonymousClass000.A00(1009));
                obj = r8.A00(cls, "thumbnail_image");
            } else {
                if (r8.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME) == null) {
                    sb2 = new StringBuilder();
                    i = 1008;
                } else if (r8.A06("is_exempt_from_attribution") || !((A00 = r8.A00(C348547yd.class, "attribution_user")) == null || A00.A05(Dbg.A02(19, 8, 23)) == null || A00.A05("instagram_user_id") == null)) {
                    AnonymousClass3FZ A003 = r8.A00(C348557ye.class, "best_instance");
                    if (A003 != null) {
                        return A05(new AnonymousClass3FZ(A003.A00));
                    }
                    sb2 = new StringBuilder();
                    i = 1005;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(AnonymousClass000.A00(1006));
                    A05 = r8.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    sb2.append(A05);
                    0wb.A03("IgCameraAREffectsConverter", sb2.toString());
                    return false;
                }
                sb2.append(AnonymousClass000.A00(i));
                A05 = r8.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                sb2.append(A05);
                0wb.A03("IgCameraAREffectsConverter", sb2.toString());
                return false;
            }
        }
        sb2.append(obj);
        0wb.A03("IgCameraAREffectsConverter", sb2.toString());
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [X.7yf, X.3FZ] */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e8, code lost:
        if (r0.ordinal() != 3) goto L_0x01ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.camera.effect.models.CameraAREffect A00(X.C348517ya r62, java.lang.Integer r63, java.lang.String r64) {
        /*
            java.lang.Class<X.7yk> r1 = X.C348617yk.class
            java.lang.String r0 = "preview_video"
            r2 = r62
            X.3FZ r1 = r2.A00(r1, r0)
            if (r1 == 0) goto L_0x0014
            java.lang.String r0 = "image_source_url"
            java.lang.String r1 = r1.A05(r0)
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            java.lang.String r1 = ""
        L_0x0016:
            com.instagram.common.typedurl.SimpleImageUrl r17 = new com.instagram.common.typedurl.SimpleImageUrl
            r0 = r17
            r0.<init>(r1)
            org.json.JSONObject r0 = r2.A00
            X.7yb r2 = new X.7yb
            r2.<init>(r0)
            java.lang.Class<X.7ye> r9 = X.C348557ye.class
            java.lang.String r8 = "best_instance"
            X.3FZ r0 = r2.A00(r9, r8)
            if (r0 == 0) goto L_0x0062
            org.json.JSONObject r0 = r0.A00
            X.7yf r4 = new X.7yf
            r4.<init>(r0)
            X.7yi r16 = r4.Ba7()
        L_0x0039:
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
            X.7yl r1 = X.C348627yl.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "enabled_surfaces"
            com.google.common.collect.ImmutableList r0 = r2.A03(r0, r1)
            X.3kO r1 = r0.iterator()
            X.0qQ.A07(r1)
        L_0x004d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            r15.add(r0)
            goto L_0x004d
        L_0x0062:
            r4 = 0
            r16 = 0
            goto L_0x0039
        L_0x0066:
            java.lang.Class<X.7yd> r1 = X.C348547yd.class
            java.lang.String r0 = "attribution_user"
            X.3FZ r5 = r2.A00(r1, r0)
            java.lang.Class<X.7ym> r1 = X.C348637ym.class
            java.lang.String r0 = "effect_action_sheet"
            X.3FZ r6 = r2.A00(r1, r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            if (r6 == 0) goto L_0x00c8
            X.7yn r3 = X.C348647yn.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "primary_actions"
            com.google.common.collect.ImmutableList r0 = r6.A03(r0, r3)
            X.3kO r1 = r0.iterator()
            X.0qQ.A07(r1)
        L_0x0091:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            r14.add(r0)
            goto L_0x0091
        L_0x00a6:
            java.lang.String r0 = "secondary_actions"
            com.google.common.collect.ImmutableList r0 = r6.A03(r0, r3)
            X.3kO r1 = r0.iterator()
            X.0qQ.A07(r1)
        L_0x00b3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            r13.add(r0)
            goto L_0x00b3
        L_0x00c8:
            java.lang.String r10 = "id"
            java.lang.String r24 = r2.A05(r10)
            java.lang.String r3 = "Required value was null."
            if (r24 == 0) goto L_0x02e3
            if (r4 == 0) goto L_0x02dd
            java.lang.String r25 = r4.A05(r10)
            if (r25 == 0) goto L_0x02dd
            java.lang.String r0 = "is_draft"
            boolean r56 = r2.A06(r0)
            r58 = 1
            java.lang.String r0 = "is_network_consent_required"
            boolean r0 = r4.A06(r0)
            r57 = 0
            if (r0 == 0) goto L_0x00ee
            r57 = 1
        L_0x00ee:
            java.lang.String r0 = "uses_flm_capability"
            boolean r0 = r4.A06(r0)
            if (r0 != 0) goto L_0x00f8
            r58 = 0
        L_0x00f8:
            if (r16 == 0) goto L_0x02d7
            java.lang.String r26 = r16.getId()
            if (r26 == 0) goto L_0x02d7
            java.lang.String r27 = r16.AjI()
            if (r27 == 0) goto L_0x02d1
            java.lang.String r28 = r16.BPb()
            X.7yj r0 = r16.Apk()
            if (r0 == 0) goto L_0x02cb
            java.lang.String r29 = r0.toString()
            if (r29 == 0) goto L_0x02cb
            java.lang.String r0 = "name"
            java.lang.String r30 = r2.A05(r0)
            if (r30 == 0) goto L_0x02c5
            java.lang.String r31 = r16.getUri()
            if (r31 == 0) goto L_0x02bf
            java.lang.String r0 = "is_animated_photo_effect"
            boolean r59 = r2.A06(r0)
            int r0 = r16.B5l()
            long r0 = (long) r0
            r21 = r0
            int r0 = r16.CBG()
            long r0 = (long) r0
            r19 = r0
            com.google.common.collect.ImmutableList r0 = r16.B03()
            if (r0 == 0) goto L_0x0165
            r1 = 10
            int r1 = X.0Yv.A1E(r0, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
            java.util.Iterator r6 = r0.iterator()
        L_0x014d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r0 = r6.next()
            X.7yp r0 = (X.C348667yp) r0
            X.0qQ.A0A(r0)
            X.LMd r1 = new X.LMd
            r1.<init>(r0)
            r7.add(r1)
            goto L_0x014d
        L_0x0165:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x016a:
            java.lang.Class<X.7yc> r1 = X.C348537yc.class
            java.lang.String r0 = "thumbnail_image"
            X.3FZ r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x02b9
            java.lang.String r1 = "uri"
            java.lang.String r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x02b9
            com.instagram.common.typedurl.SimpleImageUrl r12 = new com.instagram.common.typedurl.SimpleImageUrl
            r12.<init>(r0)
            java.lang.Class<X.7yq> r3 = X.C348677yq.class
            java.lang.String r0 = "transparent_avatar_thumbnail"
            X.3FZ r0 = r2.A00(r3, r0)
            if (r0 == 0) goto L_0x022f
            java.lang.String r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x022f
            com.instagram.common.typedurl.SimpleImageUrl r11 = new com.instagram.common.typedurl.SimpleImageUrl
            r11.<init>(r0)
        L_0x0196:
            java.util.List r43 = A02(r4)
            java.lang.String r0 = "internal_only"
            boolean r60 = r2.A06(r0)
            java.lang.String r0 = "manifest_json"
            java.lang.String r32 = r4.A05(r0)
            java.util.Set r49 = A03(r4)
            if (r5 == 0) goto L_0x0229
            java.lang.String r0 = "instagram_user_id"
            java.lang.String r33 = r5.A05(r0)
            r6 = 19
            r3 = 8
            r0 = 23
            java.lang.String r0 = X.Dbg.A02(r6, r3, r0)
            java.lang.String r34 = r5.A05(r0)
            java.lang.Class<X.7yv> r3 = X.C348727yv.class
            java.lang.String r0 = "profile_picture"
            X.3FZ r0 = r5.A00(r3, r0)
            if (r0 == 0) goto L_0x022d
            java.lang.String r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x022d
            com.instagram.common.typedurl.SimpleImageUrl r5 = new com.instagram.common.typedurl.SimpleImageUrl
            r5.<init>(r0)
        L_0x01d5:
            X.7yw r1 = X.C348737yw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "save_status"
            java.lang.Enum r0 = r2.A04(r0, r1)
            X.7yw r0 = (X.C348737yw) r0
            if (r0 == 0) goto L_0x01ea
            int r1 = r0.ordinal()
            r50 = 1
            r0 = 3
            if (r1 == r0) goto L_0x01ec
        L_0x01ea:
            r50 = 0
        L_0x01ec:
            java.util.ArrayList r44 = A01(r4)
            java.lang.String r0 = "use_hands_free"
            boolean r61 = r2.A06(r0)
            java.lang.String r1 = "hands_free_duration"
            org.json.JSONObject r0 = r2.A00
            int r51 = r0.optInt(r1)
            boolean r62 = r16.BJ6()
            X.7yx r1 = X.C348747yx.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "product_capabilities"
            com.google.common.collect.ImmutableList r0 = r2.A03(r0, r1)
            if (r0 == 0) goto L_0x0255
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r0.iterator()
        L_0x0215:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0232
            java.lang.Object r0 = r6.next()
            boolean r4 = r0.equals(r1)
            if (r4 != 0) goto L_0x0215
            r3.add(r0)
            goto L_0x0215
        L_0x0229:
            r33 = 0
            r34 = 0
        L_0x022d:
            r5 = 0
            goto L_0x01d5
        L_0x022f:
            r11 = 0
            goto L_0x0196
        L_0x0232:
            r0 = 10
            int r1 = X.0Yv.A1E(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x0241:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0257
            java.lang.Object r1 = r3.next()
            X.7yx r1 = (X.C348747yx) r1
            java.lang.String r1 = r1.name()
            r0.add(r1)
            goto L_0x0241
        L_0x0255:
            X.0sn r0 = X.0sn.A00
        L_0x0257:
            java.lang.String r1 = "formatted_media_count"
            java.lang.String r36 = r2.A05(r1)
            java.lang.String r1 = "formatted_media_accessibility"
            java.lang.String r37 = r2.A05(r1)
            java.lang.String r1 = "avatar_sdk_preset_glb"
            java.lang.String r38 = r2.A05(r1)
            X.3FZ r1 = r2.A00(r9, r8)
            if (r1 == 0) goto L_0x02b6
            org.json.JSONObject r3 = r1.A00
            X.7yf r1 = new X.7yf
            r1.<init>(r3)
            java.lang.String r3 = "required_sdk_version"
            java.lang.String r39 = r1.A05(r3)
        L_0x027c:
            X.3FZ r1 = r2.A00(r9, r8)
            if (r1 == 0) goto L_0x02b3
            org.json.JSONObject r3 = r1.A00
            X.7yf r1 = new X.7yf
            r1.<init>(r3)
            java.lang.String r40 = r1.A05(r10)
        L_0x028d:
            java.lang.String r1 = "avatar_type"
            java.lang.String r41 = r2.A05(r1)
            com.instagram.camera.effect.models.CameraAREffect r18 = new com.instagram.camera.effect.models.CameraAREffect
            r23 = r63
            r35 = r64
            r42 = r7
            r45 = r14
            r46 = r13
            r47 = r0
            r48 = r15
            r52 = r21
            r54 = r19
            r19 = r12
            r20 = r11
            r21 = r5
            r22 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r56, r57, r58, r59, r60, r61, r62)
            return r18
        L_0x02b3:
            r40 = 0
            goto L_0x028d
        L_0x02b6:
            r39 = 0
            goto L_0x027c
        L_0x02b9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346227uo.A00(X.7ya, java.lang.Integer, java.lang.String):com.instagram.camera.effect.models.CameraAREffect");
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.7ui, java.lang.Object] */
    public static final List A02(C348577yg r5) {
        ImmutableList A02 = ((AnonymousClass3FZ) r5).A02("effect_instructions", C348687yr.class);
        0qQ.A07(A02);
        ArrayList<C348697ys> arrayList = new ArrayList<>();
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C348697ys r1 = (C348697ys) next;
            if (!(r1.C83() == null || r1.getText() == null)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (C348697ys r0 : arrayList) {
            String C83 = r0.C83();
            0qQ.A0A(C83);
            String text = r0.getText();
            0qQ.A0A(text);
            ? obj = new Object();
            obj.A02 = C83;
            obj.A01 = text;
            obj.A00 = null;
            arrayList2.add(obj);
        }
        return arrayList2;
    }

    public static final ArrayList A01(C348577yg r4) {
        VersionedCapability fromServerValue;
        ImmutableList AlI = r4.AlI();
        0qQ.A07(AlI);
        ArrayList arrayList = new ArrayList();
        Iterator it = AlI.iterator();
        while (it.hasNext()) {
            C348717yu r1 = (C348717yu) it.next();
            String AlJ = r1.AlJ();
            if (!(AlJ == null || (fromServerValue = VersionedCapability.fromServerValue(AlJ)) == null)) {
                arrayList.add(new ARCapabilityMinVersionModeling(fromServerValue, r1.BTG()));
            }
        }
        return arrayList;
    }

    public static final Set A03(C348577yg r2) {
        ImmutableList AlI = r2.AlI();
        if (AlI == null) {
            return 0sl.A00;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AlI.iterator();
        while (it.hasNext()) {
            String AlJ = ((C348717yu) it.next()).AlJ();
            if (AlJ != null) {
                arrayList.add(AlJ);
            }
        }
        return 00k.A0k(arrayList);
    }

    public static final boolean A05(C348577yg r4) {
        StringBuilder sb;
        int i;
        String id;
        if (r4.Ba7() == null) {
            sb = new StringBuilder();
            sb.append(AnonymousClass000.A00(2427));
            id = r4.getId();
        } else {
            C348597yi Ba7 = r4.Ba7();
            0qQ.A0A(Ba7);
            if (Ba7.AjI() == null) {
                sb = new StringBuilder();
                i = 2425;
            } else {
                C348597yi Ba72 = r4.Ba7();
                0qQ.A0A(Ba72);
                if (Ba72.Apk() == null) {
                    sb = new StringBuilder();
                    i = 2426;
                } else {
                    C348597yi Ba73 = r4.Ba7();
                    0qQ.A0A(Ba73);
                    if (Ba73.B5l() == 0) {
                        sb = new StringBuilder();
                        i = 2423;
                    } else {
                        C348597yi Ba74 = r4.Ba7();
                        0qQ.A0A(Ba74);
                        if (Ba74.getUri() != null) {
                            return true;
                        }
                        sb = new StringBuilder();
                        i = 2424;
                    }
                }
            }
            sb.append(AnonymousClass000.A00(i));
            C348597yi Ba75 = r4.Ba7();
            0qQ.A0A(Ba75);
            id = Ba75.getId();
        }
        sb.append(id);
        0wb.A03("IgCameraAREffectsConverter", sb.toString());
        return false;
    }
}
