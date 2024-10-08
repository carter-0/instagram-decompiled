package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.MGp  reason: case insensitive filesystem */
public final class C66178MGp extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66178MGp(MediaCommentListRepository mediaCommentListRepository, String str, String str2, String str3, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A02 = 2;
        this.A03 = mediaCommentListRepository;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
    }

    public static 2IV A00(C61061Jvz jvz, Object obj, Object obj2, String str) {
        2IV r2 = new 2IV();
        r2.A09(jvz.A06, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        r2.A09(jvz.A09, "tagline");
        r2.A09(jvz.A03, DevServerEntity.COLUMN_DESCRIPTION);
        r2.A09(jvz.A0A, "new_persona_version_image_id");
        r2.A09(jvz.A05, "image_prompt");
        r2.A09(str, "welcome_message");
        r2.A09((String) obj, "icebreaker_prompt_1");
        r2.A09((String) obj2, "icebreaker_prompt_2");
        return r2;
    }

    public static 2IV A01(String str, String str2) {
        2IV r1 = new 2IV();
        r1.A09(str, "prompt");
        r1.A09(str2, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, X.MGp] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.4D7, X.MGp] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        Object obj2;
        String str;
        String str2;
        Object obj3;
        String str3;
        int i;
        AnonymousClass4D7 r6 = r10;
        switch (this.A02) {
            case 0:
                obj3 = this.A03;
                str3 = this.A04;
                str = this.A05;
                obj2 = this.A01;
                str2 = this.A06;
                i = 0;
                break;
            case 1:
                obj3 = this.A03;
                str3 = this.A04;
                str = this.A05;
                obj2 = this.A01;
                str2 = this.A06;
                i = 1;
                break;
            case 2:
                return new C66178MGp((MediaCommentListRepository) this.A03, this.A05, this.A04, this.A06, r10);
            case 3:
                obj3 = this.A03;
                obj2 = this.A01;
                str2 = this.A06;
                str = this.A05;
                str3 = this.A04;
                i = 3;
                break;
            case 4:
                obj3 = this.A03;
                str2 = this.A06;
                str = this.A05;
                obj2 = this.A01;
                str3 = this.A04;
                i = 4;
                break;
            case 5:
                obj3 = this.A03;
                str3 = this.A04;
                obj2 = this.A01;
                str = this.A05;
                str2 = this.A06;
                i = 5;
                break;
            case 6:
                obj3 = this.A03;
                str = this.A05;
                str3 = this.A04;
                str2 = this.A06;
                obj2 = this.A01;
                i = 6;
                break;
            case 7:
                obj2 = this.A01;
                str = this.A05;
                str2 = this.A06;
                obj3 = this.A03;
                str3 = this.A04;
                i = 7;
                break;
            default:
                obj3 = this.A03;
                str = this.A05;
                str2 = this.A06;
                obj2 = this.A01;
                str3 = this.A04;
                i = 8;
                break;
        }
        return new C66178MGp(obj3, obj2, str3, str, str2, r6, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.MGp] */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0887, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x08a6, code lost:
        if (r0 != r1) goto L_0x08c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x08a8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x08c8, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x029e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0534 A[LOOP:6: B:255:0x052e->B:257:0x0534, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x062d  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0675 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0706 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0718  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0734  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            r4 = r26
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x005d;
                case 1: goto L_0x0342;
                case 2: goto L_0x0680;
                case 3: goto L_0x0742;
                case 4: goto L_0x0770;
                case 5: goto L_0x07cf;
                case 6: goto L_0x0879;
                case 7: goto L_0x08a9;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 1
            if (r2 == 0) goto L_0x0017
            if (r2 == r9) goto L_0x0887
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A03
            X.Ghc r2 = (X.C53044Ghc) r2
            X.3ju r8 = r2.A0H
            java.lang.String r7 = r0.A05
            java.lang.String r2 = r0.A06
            r6 = 0
            if (r2 == 0) goto L_0x005b
            java.lang.String r5 = X.AnonymousClass7TF.A0k(r2)
        L_0x002b:
            java.lang.Object r4 = r0.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            if (r4 == 0) goto L_0x0058
            java.lang.String r2 = r4.getUsername()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0058
            r3 = 64
            java.lang.String r2 = r4.getUsername()
            java.lang.String r2 = X.002.A0D(r2, r3)
        L_0x0045:
            if (r2 == 0) goto L_0x004b
            java.lang.String r6 = X.AnonymousClass7TF.A0k(r2)
        L_0x004b:
            X.HJ7 r2 = new X.HJ7
            r2.<init>(r7, r5, r6)
            r0.A00 = r9
            java.lang.Object r0 = r8.ELH(r2, r0)
            goto L_0x08a6
        L_0x0058:
            java.lang.String r2 = r0.A04
            goto L_0x0045
        L_0x005b:
            r5 = r6
            goto L_0x002b
        L_0x005d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            r15 = 0
            if (r2 == 0) goto L_0x01c4
            if (r2 != r5) goto L_0x033d
            X.0eS.A00(r4)
        L_0x006a:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r1 = r0.A03
            X.KX0 r1 = (X.KX0) r1
            java.lang.String r2 = r0.A04
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01bb
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r4 = r4.A00
            X.3JC r4 = (X.AnonymousClass3JC) r4
            X.0eM r0 = r1.A09
            X.7I6 r3 = X.JTO.A0U(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A02(r0)
            java.lang.Object r5 = r4.A01
            X.3lr r5 = (X.C250663lr) r5
            r6 = 0
            if (r5 == 0) goto L_0x00cf
            java.lang.Class<X.BwL> r4 = X.C43321BwL.class
            r0 = 1954(0x7a2, float:2.738E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r0 = 1928859146(0x72f80e0a, float:9.8264646E30)
            X.3lr r3 = r5.getOptionalTreeField(r15, r3, r4, r0)
            if (r3 == 0) goto L_0x00cf
            r0 = 1751(0x6d7, float:2.454E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r3.getOptionalStringField(r15, r0)
            if (r3 == 0) goto L_0x00cf
            java.lang.String r0 = "name"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0141
            X.05G r0 = r1.A0Q
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r5 = r1.A0C
        L_0x00ba:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.Jvz r0 = (X.C61061Jvz) r0
            if (r0 == 0) goto L_0x013f
            X.Jvz r0 = X.C61061Jvz.A00((X.C61073JwB) null, r0, (com.instagram.common.typedurl.ImageUrl) null, (java.lang.String) null, r3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 8388603, false, false)
        L_0x00c7:
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x00ba
        L_0x00cd:
            X.0gF r6 = X.C60340gF.A00
        L_0x00cf:
            X.3Ih r4 = X.C41845B3m.A0d(r6)
        L_0x00d3:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x08c6
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0338
            X.0eM r0 = r1.A09
            X.7I6 r3 = X.JTO.A0U(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A02(r0)
            java.lang.String r0 = "name"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x00fd
            X.05G r0 = r1.A0Q
        L_0x00f0:
            X.AnonymousClass7TF.A1O(r0, r15)
        L_0x00f3:
            r2 = 2131952768(0x7f130480, float:1.9541988E38)
            X.MJj r0 = X.C66228MJj.A00
            X.KX0.A04(r1, r0, r2, r15)
            goto L_0x08c6
        L_0x00fd:
            java.lang.String r0 = "tagline"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0108
            X.05G r0 = r1.A0R
            goto L_0x00f0
        L_0x0108:
            java.lang.String r0 = "welcome_message"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0113
            X.05G r0 = r1.A0S
            goto L_0x00f0
        L_0x0113:
            java.lang.String r0 = "icebreaker_prompt_1"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x011e
            X.05G r0 = r1.A0N
            goto L_0x00f0
        L_0x011e:
            java.lang.String r0 = "icebreaker_prompt_2"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0129
            X.05G r0 = r1.A0O
            goto L_0x00f0
        L_0x0129:
            java.lang.String r0 = "icebreaker_prompt_3"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0134
            X.05G r0 = r1.A0P
            goto L_0x00f0
        L_0x0134:
            java.lang.String r0 = "example_dialogue"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x00f3
            X.05G r0 = r1.A0L
            goto L_0x00f0
        L_0x013f:
            r0 = r6
            goto L_0x00c7
        L_0x0141:
            java.lang.String r0 = "tagline"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0167
            X.05G r0 = r1.A0R
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r5 = r1.A0C
        L_0x0150:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.Jvz r0 = (X.C61061Jvz) r0
            if (r0 == 0) goto L_0x0165
            X.Jvz r0 = X.C61061Jvz.A00((X.C61073JwB) null, r0, (com.instagram.common.typedurl.ImageUrl) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r3, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 8388351, false, false)
        L_0x015d:
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0150
            goto L_0x00cd
        L_0x0165:
            r0 = r6
            goto L_0x015d
        L_0x0167:
            java.lang.String r0 = "welcome_message"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x017b
            X.05G r0 = r1.A0S
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r0 = r1.A0J
        L_0x0176:
            r0.Epw(r3)
            goto L_0x00cd
        L_0x017b:
            java.lang.String r0 = "icebreaker_prompt_1"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x018b
            X.05G r0 = r1.A0N
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r0 = r1.A0G
            goto L_0x0176
        L_0x018b:
            java.lang.String r0 = "icebreaker_prompt_2"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x019b
            X.05G r0 = r1.A0O
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r0 = r1.A0H
            goto L_0x0176
        L_0x019b:
            java.lang.String r0 = "icebreaker_prompt_3"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x01ab
            X.05G r0 = r1.A0P
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r0 = r1.A0I
            goto L_0x0176
        L_0x01ab:
            java.lang.String r0 = "example_dialogue"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x00cd
            X.05G r0 = r1.A0L
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r0 = r1.A0F
            goto L_0x0176
        L_0x01bb:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00d3
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01c4:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A03
            X.KX0 r4 = (X.KX0) r4
            X.0Ud r2 = r4.A0b
            X.Jvz r12 = X.JTO.A0V(r2)
            if (r12 == 0) goto L_0x08c6
            java.lang.String r11 = r12.A0B
            java.util.List r3 = r12.A0G
            java.lang.Object r10 = r3.get(r15)
            java.lang.Object r9 = r3.get(r5)
            r2 = 2
            java.lang.Object r8 = r3.get(r2)
            java.util.List r3 = r12.A0F
            if (r3 == 0) goto L_0x01fa
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r6 = r3.iterator()
        L_0x01f0:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x01fc
            X.JTU.A1N(r2, r6)
            goto L_0x01f0
        L_0x01fa:
            X.0sn r2 = X.0sn.A00
        L_0x01fc:
            java.util.ArrayList r7 = X.00k.A0U(r2)
            java.lang.String r6 = r0.A04
            java.lang.String r2 = "name"
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x029f
            X.05G r2 = r4.A0Q
        L_0x020c:
            X.AnonymousClass7TF.A1O(r2, r5)
        L_0x020f:
            X.2IV r9 = A00(r12, r10, r9, r11)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r2 = "icebreaker_prompt_3"
            r9.A09(r8, r2)
            java.util.List r3 = r12.A0I
            java.lang.String r2 = "facts"
            r9.A05(r2, r3)
            java.lang.String r2 = "example_dialogue"
            r9.A05(r2, r7)
            java.util.List r2 = r12.A0D
            java.util.List r3 = X.KX0.A02(r2)
            java.lang.String r2 = "capabilities"
            r9.A05(r2, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            java.lang.String r2 = "update_facts"
            r9.A08(r2, r3)
            java.lang.String r2 = "update_capabilities"
            r9.A08(r2, r3)
            X.0K0 r3 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r16 = 0
            java.lang.String r2 = "field_to_regenerate"
            X.0Df r7 = X.C41845B3m.A03(r3, r6, r2)
            java.lang.String r3 = "current_displayed_attributes"
            X.0Df r2 = r9.A02()
            r7.A0E(r2, r3)
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x025b
            java.lang.String r2 = "field_idx_for_vec"
            X.0Df.A00(r7, r3, r2)
        L_0x025b:
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            java.lang.String r2 = "input"
            X.1vR r10 = X.C41847B3o.A04(r7, r6, r2)
            java.util.Map r12 = r6.getParamsCopy()
            java.util.Map r13 = r3.getParamsCopy()
            java.lang.Class<X.BwM> r14 = X.C43322BwM.class
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.lang.String r11 = "KirbyFieldRegenerationQuery"
            java.lang.String r19 = "xfb_fetch_mobile_kirby_field_regeneration"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.instagram.common.session.UserSession r7 = r4.A03
            X.0Tu r6 = X.0Tu.A05
            r2 = 36611679915677952(0x82122100011900, double:3.216712029852176E-306)
            int r2 = X.DbS.A04(r6, r7, r2)
            r9.setNetworkTimeoutSeconds(r2)
            X.1vn r2 = r4.A04
            r0.A00 = r5
            java.lang.Object r4 = r2.A04(r9, r0)
            if (r4 != r1) goto L_0x006a
            return r1
        L_0x029f:
            java.lang.String r2 = "tagline"
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x02ab
            X.05G r2 = r4.A0R
            goto L_0x020c
        L_0x02ab:
            java.lang.String r2 = "welcome_message"
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x02bf
            X.05G r2 = r4.A0S
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x020f
            r11 = r2
            goto L_0x020f
        L_0x02bf:
            java.lang.String r2 = "icebreaker_prompt_1"
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x02d3
            X.05G r2 = r4.A0N
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x020f
            r10 = r2
            goto L_0x020f
        L_0x02d3:
            java.lang.String r2 = "icebreaker_prompt_2"
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x02e7
            X.05G r2 = r4.A0O
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x020f
            r9 = r2
            goto L_0x020f
        L_0x02e7:
            java.lang.String r2 = "icebreaker_prompt_3"
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x02fb
            X.05G r2 = r4.A0P
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x020f
            r8 = r2
            goto L_0x020f
        L_0x02fb:
            java.lang.String r2 = "example_dialogue"
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x020f
            X.05G r2 = r4.A0L
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.Object r3 = r0.A01
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x020f
            java.lang.String r14 = r0.A05
            if (r14 == 0) goto L_0x020f
            java.lang.String r13 = r0.A06
            boolean r2 = X.DbT.A1b(r7)
            if (r2 == 0) goto L_0x032f
            int r3 = r3.intValue()
            if (r3 < 0) goto L_0x032f
            int r2 = r7.size()
            if (r3 >= r2) goto L_0x032f
            X.2IV r2 = A01(r13, r14)
            r7.set(r3, r2)
            goto L_0x020f
        L_0x032f:
            X.2IV r2 = A01(r13, r14)
            r7.add(r2)
            goto L_0x020f
        L_0x0338:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x033d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0342:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            r15 = 0
            if (r2 == 0) goto L_0x04c0
            if (r2 != r5) goto L_0x067b
            X.0eS.A00(r4)
        L_0x034f:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r5 = r0.A03
            com.instagram.aistudio.editor.AiSettingsRepository r5 = (com.instagram.aistudio.editor.AiSettingsRepository) r5
            java.lang.String r1 = r0.A04
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x04b7
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r3 = r4.A00
            X.3JC r3 = (X.AnonymousClass3JC) r3
            X.0eM r0 = r5.A07
            X.7I6 r2 = X.JTO.A0U(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A02(r0)
            java.lang.Object r4 = r3.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x04b4
            java.lang.Class<X.BwL> r3 = X.C43321BwL.class
            r0 = 1954(0x7a2, float:2.738E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 1928859146(0x72f80e0a, float:9.8264646E30)
            X.3lr r2 = r4.getOptionalTreeField(r15, r2, r3, r0)
            if (r2 == 0) goto L_0x04b4
            r0 = 1751(0x6d7, float:2.454E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r6 = r2.getOptionalStringField(r15, r0)
            if (r6 == 0) goto L_0x04b4
            java.lang.String r0 = "name"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0425
            X.05G r0 = r5.A0Q
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r3 = r5.A08
        L_0x039e:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.Jvz r0 = (X.C61061Jvz) r0
            if (r0 == 0) goto L_0x0423
            X.Jvz r0 = X.C61061Jvz.A00((X.C61073JwB) null, r0, (com.instagram.common.typedurl.ImageUrl) null, (java.lang.String) null, r6, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 8388603, false, false)
        L_0x03ab:
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x039e
            r7 = 0
            r13 = 254(0xfe, float:3.56E-43)
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            com.instagram.aistudio.editor.AiSettingsRepository.A07(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x03bc:
            X.0gF r0 = X.C60340gF.A00
        L_0x03be:
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x03c2:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x08c6
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0676
            X.0eM r0 = r5.A07
            X.7I6 r2 = X.JTO.A0U(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A02(r0)
            java.lang.String r0 = "name"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x03ec
            X.05G r0 = r5.A0Q
        L_0x03df:
            X.AnonymousClass7TF.A1O(r0, r15)
        L_0x03e2:
            java.lang.String r1 = "regenerate_field_error"
            r0 = 2131952768(0x7f130480, float:1.9541988E38)
            com.instagram.aistudio.editor.AiSettingsRepository.A06(r5, r1, r0)
            goto L_0x08c6
        L_0x03ec:
            java.lang.String r0 = "tagline"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x03f7
            X.05G r0 = r5.A0T
            goto L_0x03df
        L_0x03f7:
            java.lang.String r0 = "icebreaker_prompt_1"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0402
            X.05G r0 = r5.A0N
            goto L_0x03df
        L_0x0402:
            java.lang.String r0 = "icebreaker_prompt_2"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x040d
            X.05G r0 = r5.A0O
            goto L_0x03df
        L_0x040d:
            java.lang.String r0 = "icebreaker_prompt_3"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0418
            X.05G r0 = r5.A0P
            goto L_0x03df
        L_0x0418:
            java.lang.String r0 = "example_dialogue"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x03e2
            X.05G r0 = r5.A0L
            goto L_0x03df
        L_0x0423:
            r0 = 0
            goto L_0x03ab
        L_0x0425:
            java.lang.String r0 = "tagline"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0460
            X.05G r0 = r5.A0T
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r3 = r5.A08
        L_0x0434:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.Jvz r0 = (X.C61061Jvz) r0
            if (r0 == 0) goto L_0x045e
            X.Jvz r0 = X.C61061Jvz.A00((X.C61073JwB) null, r0, (com.instagram.common.typedurl.ImageUrl) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r6, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 8388351, false, false)
        L_0x0441:
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0434
            r17 = 0
            r24 = 253(0xfd, float:3.55E-43)
            r16 = r5
            r18 = r6
            r19 = r17
            r20 = r17
            r21 = r17
            r22 = r17
            r23 = r17
            com.instagram.aistudio.editor.AiSettingsRepository.A07(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03bc
        L_0x045e:
            r0 = 0
            goto L_0x0441
        L_0x0460:
            java.lang.String r0 = "welcome_message"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0474
            X.05G r0 = r5.A0U
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r0 = r5.A0F
        L_0x046f:
            r0.Epw(r6)
            goto L_0x03bc
        L_0x0474:
            java.lang.String r0 = "icebreaker_prompt_1"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0484
            X.05G r0 = r5.A0N
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r0 = r5.A0C
            goto L_0x046f
        L_0x0484:
            java.lang.String r0 = "icebreaker_prompt_2"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0494
            X.05G r0 = r5.A0O
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r0 = r5.A0D
            goto L_0x046f
        L_0x0494:
            java.lang.String r0 = "icebreaker_prompt_3"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x04a4
            X.05G r0 = r5.A0P
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r0 = r5.A0E
            goto L_0x046f
        L_0x04a4:
            java.lang.String r0 = "example_dialogue"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x03bc
            X.05G r0 = r5.A0L
            X.AnonymousClass7TF.A1O(r0, r15)
            X.05G r0 = r5.A0B
            goto L_0x046f
        L_0x04b4:
            r0 = 0
            goto L_0x03be
        L_0x04b7:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x03c2
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x04c0:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A03
            com.instagram.aistudio.editor.AiSettingsRepository r4 = (com.instagram.aistudio.editor.AiSettingsRepository) r4
            X.Jvz r11 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r4)
            if (r11 == 0) goto L_0x08c6
            java.lang.String r12 = r11.A0B
            java.util.List r3 = r11.A0G
            java.lang.Object r10 = r3.get(r15)
            java.lang.Object r6 = r3.get(r5)
            r2 = 2
            java.lang.Object r9 = r3.get(r2)
            java.util.List r3 = r11.A0F
            if (r3 == 0) goto L_0x04f4
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r7 = r3.iterator()
        L_0x04ea:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x04f6
            X.JTU.A1N(r2, r7)
            goto L_0x04ea
        L_0x04f4:
            X.0sn r2 = X.0sn.A00
        L_0x04f6:
            java.util.ArrayList r8 = X.00k.A0U(r2)
            java.lang.String r7 = r0.A04
            java.lang.String r2 = "name"
            boolean r2 = X.0qQ.A0K(r7, r2)
            if (r2 == 0) goto L_0x0568
            X.05G r2 = r4.A0Q
        L_0x0506:
            X.AnonymousClass7TF.A1O(r2, r5)
        L_0x0509:
            X.2IV r6 = A00(r11, r10, r6, r12)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r2 = "icebreaker_prompt_3"
            r6.A09(r9, r2)
            java.util.List r3 = r11.A0I
            java.lang.String r2 = "facts"
            r6.A05(r2, r3)
            java.lang.String r2 = "example_dialogue"
            r6.A05(r2, r8)
            java.util.List r2 = r11.A0D
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            if (r2 != 0) goto L_0x052a
            X.0sn r2 = X.0sn.A00
        L_0x052a:
            java.util.Iterator r11 = r2.iterator()
        L_0x052e:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x05ff
            java.lang.Object r10 = r11.next()
            X.GSY r10 = (X.GSY) r10
            X.2IV r8 = new X.2IV
            r8.<init>()
            java.lang.Object r2 = r10.A01
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "plugin_type"
            r8.A09(r3, r2)
            r3 = 0
            java.lang.String r2 = "plugin_overrides"
            r8.A05(r2, r3)
            java.lang.String r2 = "INSTAGRAM"
            java.util.List r3 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r2 = "enabled_apps"
            r8.A05(r2, r3)
            java.lang.Object r3 = r10.A00
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.String r2 = "is_enabled"
            r8.A08(r2, r3)
            r9.add(r8)
            goto L_0x052e
        L_0x0568:
            java.lang.String r2 = "tagline"
            boolean r2 = X.0qQ.A0K(r7, r2)
            if (r2 == 0) goto L_0x0573
            X.05G r2 = r4.A0T
            goto L_0x0506
        L_0x0573:
            java.lang.String r2 = "welcome_message"
            boolean r2 = X.0qQ.A0K(r7, r2)
            if (r2 == 0) goto L_0x0586
            X.05G r2 = r4.A0U
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x0509
            r12 = r2
            goto L_0x0509
        L_0x0586:
            java.lang.String r2 = "icebreaker_prompt_1"
            boolean r2 = X.0qQ.A0K(r7, r2)
            if (r2 == 0) goto L_0x059a
            X.05G r2 = r4.A0N
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x0509
            r10 = r2
            goto L_0x0509
        L_0x059a:
            java.lang.String r2 = "icebreaker_prompt_2"
            boolean r2 = X.0qQ.A0K(r7, r2)
            if (r2 == 0) goto L_0x05ae
            X.05G r2 = r4.A0O
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x0509
            r6 = r2
            goto L_0x0509
        L_0x05ae:
            java.lang.String r2 = "icebreaker_prompt_3"
            boolean r2 = X.0qQ.A0K(r7, r2)
            if (r2 == 0) goto L_0x05c2
            X.05G r2 = r4.A0P
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x0509
            r9 = r2
            goto L_0x0509
        L_0x05c2:
            java.lang.String r2 = "example_dialogue"
            boolean r2 = X.0qQ.A0K(r7, r2)
            if (r2 == 0) goto L_0x0509
            X.05G r2 = r4.A0L
            X.AnonymousClass7TF.A1O(r2, r5)
            java.lang.Object r3 = r0.A01
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x0509
            java.lang.String r14 = r0.A05
            if (r14 == 0) goto L_0x0509
            java.lang.String r13 = r0.A06
            boolean r2 = X.DbT.A1b(r8)
            if (r2 == 0) goto L_0x05f6
            int r3 = r3.intValue()
            if (r3 < 0) goto L_0x05f6
            int r2 = r8.size()
            if (r3 >= r2) goto L_0x05f6
            X.2IV r2 = A01(r13, r14)
            r8.set(r3, r2)
            goto L_0x0509
        L_0x05f6:
            X.2IV r2 = A01(r13, r14)
            r8.add(r2)
            goto L_0x0509
        L_0x05ff:
            java.util.List r3 = X.00k.A0a(r9)
            java.lang.String r2 = "capabilities"
            r6.A05(r2, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            java.lang.String r2 = "update_facts"
            r6.A08(r2, r3)
            java.lang.String r2 = "update_capabilities"
            r6.A08(r2, r3)
            X.0K0 r3 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r16 = 0
            java.lang.String r2 = "field_to_regenerate"
            X.0Df r7 = X.C41845B3m.A03(r3, r7, r2)
            java.lang.String r3 = "current_displayed_attributes"
            X.0Df r2 = r6.A02()
            r7.A0E(r2, r3)
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x0632
            java.lang.String r2 = "field_idx_for_vec"
            X.0Df.A00(r7, r3, r2)
        L_0x0632:
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            java.lang.String r2 = "input"
            X.1vR r10 = X.C41847B3o.A04(r7, r6, r2)
            java.util.Map r12 = r6.getParamsCopy()
            java.util.Map r13 = r3.getParamsCopy()
            java.lang.Class<X.BwM> r14 = X.C43322BwM.class
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.lang.String r11 = "KirbyFieldRegenerationQuery"
            java.lang.String r19 = "xfb_fetch_mobile_kirby_field_regeneration"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.instagram.common.session.UserSession r7 = r4.A02
            X.0Tu r6 = X.0Tu.A05
            r2 = 36611679915677952(0x82122100011900, double:3.216712029852176E-306)
            int r2 = X.DbS.A04(r6, r7, r2)
            r9.setNetworkTimeoutSeconds(r2)
            X.1vn r2 = r4.A03
            r0.A00 = r5
            java.lang.Object r4 = r2.A04(r9, r0)
            if (r4 != r1) goto L_0x034f
            return r1
        L_0x0676:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x067b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0680:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 4
            r5 = 3
            r8 = 2
            r6 = 1
            if (r3 == 0) goto L_0x06c4
            if (r3 == r6) goto L_0x06ea
            if (r3 == r8) goto L_0x0707
            if (r3 != r5) goto L_0x0887
            X.0eS.A00(r4)
        L_0x0693:
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x0697:
            java.lang.Object r8 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r8 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r8
            java.lang.String r11 = r0.A05
            java.lang.String r7 = r0.A06
            java.lang.String r6 = r0.A04
            boolean r3 = r4 instanceof X.C239793Ih
            if (r3 != 0) goto L_0x08c6
            boolean r3 = r4 instanceof X.C297815sO
            if (r3 == 0) goto L_0x073d
            X.7a0 r5 = r8.A06
            if (r5 == 0) goto L_0x06b6
            X.GmL r3 = r8.A04
            java.lang.String r4 = r3.A0E
            java.lang.String r3 = "unhide_comment_failed"
            r5.A0C(r3, r4, r11, r7)
        L_0x06b6:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            X.7de r9 = X.C335857de.COVERED_COMMENT
            r0.A00 = r2
            r12 = r6
            r13 = r0
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A03(r8, r9, r10, r11, r12, r13)
            goto L_0x08a6
        L_0x06c4:
            X.0eS.A00(r4)
            java.lang.Object r9 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r9 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r9
            X.7aH r4 = X.C51968G9o.A0g(r9)
            java.lang.String r12 = r0.A05
            java.lang.String r3 = r0.A04
            X.7dj r7 = X.C335067cK.A01(r4, r12, r3)
            if (r7 == 0) goto L_0x08c6
            java.lang.Integer r11 = X.AnonymousClass05K.A0j
            X.7de r10 = X.C335857de.A04
            r0.A01 = r7
            r0.A00 = r6
            r13 = r3
            r14 = r0
            java.lang.Object r3 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A03(r9, r10, r11, r12, r13, r14)
            if (r3 != r1) goto L_0x06f1
            return r1
        L_0x06ea:
            java.lang.Object r7 = r0.A01
            X.7dj r7 = (X.C335907dj) r7
            X.0eS.A00(r4)
        L_0x06f1:
            java.lang.Object r3 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r3 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r3
            com.instagram.common.session.UserSession r6 = r3.A0B
            X.GmL r3 = r3.A04
            java.lang.String r4 = r3.A0E
            r3 = 0
            r0.A01 = r3
            r0.A00 = r8
            java.lang.Object r4 = com.instagram.comments.mvvm.data.network.UnhideActionNetworkRequestsKt.A00(r7, r6, r4, r0)
            if (r4 != r1) goto L_0x070a
            return r1
        L_0x0707:
            X.0eS.A00(r4)
        L_0x070a:
            java.lang.Object r9 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r9 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r9
            java.lang.String r12 = r0.A05
            java.lang.String r8 = r0.A06
            java.lang.String r7 = r0.A04
            boolean r3 = r4 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x0734
            X.7a0 r6 = r9.A06
            if (r6 == 0) goto L_0x0725
            X.GmL r3 = r9.A04
            java.lang.String r4 = r3.A0E
            java.lang.String r3 = "unhide_comment_success"
            r6.A0C(r3, r4, r12, r8)
        L_0x0725:
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.7de r10 = X.C335857de.A04
            r0.A00 = r5
            r13 = r7
            r14 = r0
            java.lang.Object r3 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A03(r9, r10, r11, r12, r13, r14)
            if (r3 != r1) goto L_0x0693
            return r1
        L_0x0734:
            boolean r3 = r4 instanceof X.C297815sO
            if (r3 != 0) goto L_0x0697
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x073d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0742:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0750
            if (r2 == r8) goto L_0x0887
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0750:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A03
            X.GhM r2 = (X.C53031GhM) r2
            X.0V2 r7 = r2.A04
            java.lang.Object r6 = r0.A01
            X.1Xj r6 = (X.1Xj) r6
            java.lang.String r5 = r0.A06
            java.lang.String r4 = r0.A05
            java.lang.String r3 = r0.A04
            X.KPr r2 = new X.KPr
            r2.<init>(r6, r5, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = r7.emit(r2, r0)
            goto L_0x08a6
        L_0x0770:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x07a4
            if (r2 != r3) goto L_0x07ca
            X.0eS.A00(r4)
        L_0x077c:
            X.JwH r4 = (X.C61079JwH) r4
            java.lang.Object r5 = r0.A01
            X.05G r5 = (X.05G) r5
            java.lang.Object r0 = r5.getValue()
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.Object r1 = r0.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r4.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.00k.A0S(r0, r1)
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            X.Kmn r1 = (X.C62811Kmn) r1
            X.JwH r0 = new X.JwH
            r0.<init>((X.C62811Kmn) r1, (java.lang.String) r2, (java.util.List) r3)
            r5.Epw(r0)
            goto L_0x08c6
        L_0x07a4:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A03
            X.Jhp r2 = (X.C60232Jhp) r2
            com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository r4 = r2.A02
            java.lang.String r5 = r0.A06
            java.lang.String r6 = r0.A05
            java.lang.Object r2 = r0.A01
            X.05G r2 = (X.05G) r2
            java.lang.Object r2 = r2.getValue()
            X.JwH r2 = (X.C61079JwH) r2
            java.lang.String r7 = r2.A02
            java.lang.String r2 = r0.A04
            r0.A00 = r3
            r8 = r2
            r9 = r0
            java.lang.Object r4 = r4.A01(r5, r6, r7, r8, r9)
            if (r4 != r1) goto L_0x077c
            return r1
        L_0x07ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07cf:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0804
            if (r2 != r5) goto L_0x086f
            X.0eS.A00(r4)
        L_0x07db:
            boolean r3 = X.AnonymousClass7TE.A1a(r4)
            java.lang.Object r1 = r0.A03
            X.UnS r1 = (X.C16039UnS) r1
            java.lang.String r2 = r0.A06
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.VsB r1 = r1.A0M
            if (r3 == 0) goto L_0x0801
            java.lang.String r8 = "success"
        L_0x07ef:
            X.XB6 r3 = r1.A00
            java.lang.String r5 = r1.A01
            r0 = 0
            android.os.Bundle r4 = X.C18462VsB.A00(r1, r2, r0)
            java.lang.String r6 = "lead_gen_recon_notif"
            java.lang.String r7 = "recon_notif_mutation"
            r3.Cgq(r4, r5, r6, r7, r8)
            goto L_0x08c6
        L_0x0801:
            java.lang.String r8 = "fail"
            goto L_0x07ef
        L_0x0804:
            X.0eS.A00(r4)
            java.lang.Object r6 = r0.A03
            X.UnS r6 = (X.C16039UnS) r6
            java.util.List r2 = r6.A02()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r2.iterator()
        L_0x0817:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x084a
            java.lang.Object r8 = r9.next()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r8 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r8
            java.lang.String r2 = r8.A00
            boolean r2 = X.C51966G9m.A1X(r2)
            if (r2 == 0) goto L_0x0817
            X.2IV r7 = new X.2IV
            r7.<init>()
            java.lang.String r3 = r8.A09
            r2 = 3132(0xc3c, float:4.389E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r7.A09(r3, r2)
            java.lang.String r2 = r8.A00
            java.util.List r3 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r2 = "values"
            r7.A05(r2, r3)
            r4.add(r7)
            goto L_0x0817
        L_0x084a:
            boolean r2 = X.AnonymousClass7TE.A1b(r4)
            if (r2 == 0) goto L_0x08c6
            com.instagram.leadads.repository.LeadFormRepository r7 = r6.A0K
            java.lang.String r8 = r0.A04
            java.lang.String r9 = r6.A0V
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r10 = r2.getId()
            if (r10 == 0) goto L_0x0874
            java.lang.String r11 = r0.A05
            java.lang.String r12 = r6.A0P
            r0.A00 = r5
            r13 = r4
            r14 = r0
            java.lang.Object r4 = r7.A00(r8, r9, r10, r11, r12, r13, r14)
            if (r4 != r1) goto L_0x07db
            return r1
        L_0x086f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0874:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0879:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x088b
            if (r2 == r3) goto L_0x0887
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0887:
            X.0eS.A00(r4)
            goto L_0x08c6
        L_0x088b:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A03
            X.L4v r2 = (X.C63737L4v) r2
            com.instagram.nme.contextualpromo.ContextualPromoApi r4 = r2.A00
            java.lang.String r6 = r0.A05
            java.lang.String r7 = r0.A04
            java.lang.String r2 = r0.A06
            java.lang.Object r5 = r0.A01
            X.EWr r5 = (X.C48125EWr) r5
            r0.A00 = r3
            r8 = r2
            r9 = r0
            java.lang.Object r0 = r4.A00(r5, r6, r7, r8, r9)
        L_0x08a6:
            if (r0 != r1) goto L_0x08c6
            return r1
        L_0x08a9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x08d2
            if (r2 != r3) goto L_0x08fa
            X.0eS.A00(r4)
        L_0x08b5:
            boolean r1 = r4 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x08c9
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.FragmentActivity r1 = X.DbT.A0E(r0)
            r0 = -1
            r1.setResult(r0)
            r1.finish()
        L_0x08c6:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x08c9:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x08c6
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x08d2:
            X.0eS.A00(r4)
            com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil r4 = com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A00
            java.lang.Object r2 = r0.A01
            X.KXd r2 = (X.C62041KXd) r2
            X.0eM r2 = r2.A0C
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r6 = r0.A05
            java.lang.String r7 = r0.A06
            java.lang.Object r2 = r0.A03
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r9 = r2.A00
            java.util.List r9 = (java.util.List) r9
            r10 = 0
            java.lang.String r8 = r0.A04
            r0.A00 = r3
            r11 = r0
            java.lang.Object r4 = r4.A06(r5, r6, r7, r8, r9, r10, r11)
            if (r4 != r1) goto L_0x08b5
            return r1
        L_0x08fa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66178MGp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66178MGp) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66178MGp(Object obj, Object obj2, String str, String str2, String str3, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A02 = i;
        this.A03 = obj;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = obj2;
        this.A06 = str3;
    }
}
