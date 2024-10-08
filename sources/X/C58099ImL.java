package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.ImL  reason: case insensitive filesystem */
public final class C58099ImL extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;

    public static void A01(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new C58099ImL(obj, (AnonymousClass4D7) null, i), r3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58099ImL(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.ImL, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.ImL, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        Object obj2;
        int i;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                i = 1;
                break;
            case 2:
                obj2 = this.A02;
                i = 2;
                break;
            case 3:
                obj2 = this.A02;
                i = 3;
                break;
            case 4:
                obj2 = this.A02;
                i = 4;
                break;
            case 5:
                obj2 = this.A02;
                i = 5;
                break;
            case 6:
                obj2 = this.A02;
                i = 6;
                break;
            case 7:
                obj2 = this.A02;
                i = 7;
                break;
            case 8:
                obj2 = this.A02;
                i = 8;
                break;
            case 9:
                obj2 = this.A02;
                i = 9;
                break;
            case 10:
                obj2 = this.A02;
                i = 10;
                break;
            case 11:
                obj2 = this.A02;
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                obj2 = this.A02;
                i = 12;
                break;
            case 13:
                obj2 = this.A02;
                i = 13;
                break;
            case 14:
                obj2 = this.A02;
                i = 14;
                break;
            case 15:
                obj2 = this.A02;
                i = 15;
                break;
            case 16:
                obj2 = this.A02;
                i = 16;
                break;
            case 17:
                obj2 = this.A02;
                i = 17;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                obj2 = this.A02;
                i = 18;
                break;
            case 19:
                obj2 = this.A02;
                i = 19;
                break;
            case 20:
                obj2 = this.A02;
                i = 20;
                break;
            case 21:
                obj2 = this.A02;
                i = 21;
                break;
            case 22:
                obj2 = this.A02;
                i = 22;
                break;
            case 23:
                obj2 = this.A02;
                i = 23;
                break;
            case 24:
                obj2 = this.A02;
                i = 24;
                break;
            case 25:
                obj2 = this.A02;
                i = 25;
                break;
            case 26:
                obj2 = this.A02;
                i = 26;
                break;
            case 27:
                obj2 = this.A02;
                i = 27;
                break;
            case 28:
                obj2 = this.A02;
                i = 28;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                obj2 = this.A02;
                i = 29;
                break;
            case 30:
                obj2 = this.A02;
                i = 30;
                break;
            case 31:
                obj2 = this.A02;
                i = 31;
                break;
            case 32:
                obj2 = this.A02;
                i = 32;
                break;
            case 33:
                obj2 = this.A02;
                i = 33;
                break;
            case 34:
                obj2 = this.A02;
                i = 34;
                break;
            case 35:
                obj2 = this.A02;
                i = 35;
                break;
            case 36:
                obj2 = this.A02;
                i = 36;
                break;
            case 37:
                obj2 = this.A02;
                i = 37;
                break;
            case 38:
                ? imL = new C58099ImL(this.A02, r5, 38);
                imL.A00 = AnonymousClass7TE.A0M(obj);
                return imL;
            case 39:
                obj2 = this.A02;
                i = 39;
                break;
            case 40:
                obj2 = this.A02;
                i = 40;
                break;
            case Seq.NULL_REFNUM:
                obj2 = this.A02;
                i = 41;
                break;
            case Seq.RefTracker.REF_OFFSET:
                obj2 = this.A02;
                i = 42;
                break;
            case 43:
                obj2 = this.A02;
                i = 43;
                break;
            case 44:
                obj2 = this.A02;
                i = 44;
                break;
            default:
                obj2 = this.A02;
                i = 45;
                break;
        }
        return new C58099ImL(obj2, r5, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 create;
        if (38 - this.A01 != 0) {
            create = AnonymousClass7TE.A1M(obj2, obj, this);
        } else {
            create = create(Integer.valueOf(AnonymousClass7TE.A0M(obj)), (AnonymousClass4D7) obj2);
        }
        return ((C58099ImL) create).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.ImL, X.4D7] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028c, code lost:
        r4.Epw(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0834, code lost:
        X.0eS.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x086c, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0949, code lost:
        if (r0 != r1) goto L_0x086c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x094b, code lost:
        if (r0 != r1) goto L_0x095e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x094d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b6, code lost:
        X.C51965G9l.A15();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bd, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            r7 = r28
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x0017;
                case 1: goto L_0x004e;
                case 2: goto L_0x00a0;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00f6;
                case 5: goto L_0x011f;
                case 6: goto L_0x015b;
                case 7: goto L_0x0184;
                case 8: goto L_0x01be;
                case 9: goto L_0x01e7;
                case 10: goto L_0x0223;
                case 11: goto L_0x024d;
                case 12: goto L_0x02b1;
                case 13: goto L_0x02d5;
                case 14: goto L_0x02f5;
                case 15: goto L_0x031b;
                case 16: goto L_0x0341;
                case 17: goto L_0x0378;
                case 18: goto L_0x03a3;
                case 19: goto L_0x03e5;
                case 20: goto L_0x0009;
                case 21: goto L_0x0009;
                case 22: goto L_0x0431;
                case 23: goto L_0x0460;
                case 24: goto L_0x04af;
                case 25: goto L_0x04e5;
                case 26: goto L_0x0505;
                case 27: goto L_0x0525;
                case 28: goto L_0x054b;
                case 29: goto L_0x057c;
                case 30: goto L_0x059c;
                case 31: goto L_0x05ca;
                case 32: goto L_0x05f3;
                case 33: goto L_0x060a;
                case 34: goto L_0x0651;
                case 35: goto L_0x0691;
                case 36: goto L_0x06b5;
                case 37: goto L_0x070b;
                case 38: goto L_0x094e;
                case 39: goto L_0x073a;
                case 40: goto L_0x0769;
                case 41: goto L_0x0798;
                case 42: goto L_0x07c3;
                case 43: goto L_0x07eb;
                case 44: goto L_0x0807;
                case 45: goto L_0x0823;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0870
            if (r2 == r4) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0028
            if (r2 == r3) goto L_0x003f
            if (r2 == r4) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0028:
            java.lang.Object r2 = A00(r7, r0)
            com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r2 = (com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel) r2
            r0.A00 = r3
            X.05G r3 = r2.A05
            X.HIk r2 = X.C54549HIk.A00
            java.lang.Object r2 = r3.emit(r2, r0)
            if (r2 == r1) goto L_0x003c
            X.0gF r2 = X.C60340gF.A00
        L_0x003c:
            if (r2 != r1) goto L_0x0042
            return r1
        L_0x003f:
            X.0eS.A00(r7)
        L_0x0042:
            java.lang.Object r2 = r0.A02
            com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r2 = (com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel) r2
            r0.A00 = r4
            java.lang.Object r0 = com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel.A00(r2, r2, r0)
            goto L_0x094b
        L_0x004e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r4) goto L_0x0072
            if (r2 == r5) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x005f:
            java.lang.Object r2 = A00(r7, r0)
            X.GhS r2 = (X.C53036GhS) r2
            com.meta.metaai.shared.nux.data.MetaAINuxRepository r3 = r2.A06
            X.HLw r2 = r2.A07
            r0.A00 = r4
            java.lang.Object r7 = r3.A01(r2, r0)
            if (r7 != r1) goto L_0x0075
            return r1
        L_0x0072:
            X.0eS.A00(r7)
        L_0x0075:
            java.lang.Object r3 = r0.A02
            X.GhS r3 = (X.C53036GhS) r3
            boolean r2 = X.AnonymousClass7TE.A1a(r7)
            if (r2 == 0) goto L_0x008d
            X.05G r4 = r3.A09
            r4.getValue()
            X.HIs r0 = X.C54557HIs.A00
            X.I1Z r5 = new X.I1Z
            r5.<init>(r0)
            goto L_0x028c
        L_0x008d:
            X.C53036GhS.A02(r3)
            com.meta.metaai.shared.nux.data.MetaAINuxRepository r4 = r3.A06
            X.HLw r3 = r3.A07
            java.lang.String r2 = r3.toString()
            r0.A00 = r5
            java.lang.Object r0 = r4.A00(r3, r2, r0)
            goto L_0x094b
        L_0x00a0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x00ae
            if (r2 == r5) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ae:
            java.lang.Object r2 = A00(r7, r0)
            X.GhS r2 = (X.C53036GhS) r2
            com.meta.metaai.shared.nux.data.MetaAINuxRepository r4 = r2.A06
            X.HLw r3 = r2.A07
            java.lang.String r2 = r3.toString()
            r0.A00 = r5
            java.lang.Object r0 = r4.A00(r3, r2, r0)
            goto L_0x094b
        L_0x00c4:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x00d2
            if (r2 == r6) goto L_0x00ee
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d2:
            java.lang.Object r5 = A00(r7, r0)
            X.HIp r5 = (X.C54554HIp) r5
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r2 = r5.A02
            if (r2 == 0) goto L_0x01b6
            X.0Ud r4 = r2.A0C
            r3 = 54
            X.IkU r2 = new X.IkU
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x00f1
            return r1
        L_0x00ee:
            X.0eS.A00(r7)
        L_0x00f1:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x00f6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0104:
            java.lang.Object r7 = A00(r7, r0)
            X.I4d r7 = (X.C56604I4d) r7
            androidx.fragment.app.Fragment r6 = X.C56604I4d.A09(r7)
            X.07U r5 = X.07U.A01
            r4 = 0
            r3 = 3
            X.ImL r2 = new X.ImL
            r2.<init>(r7, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r5, r6, r0, r2)
            goto L_0x094b
        L_0x011f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x012d
            if (r2 == r6) goto L_0x0153
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x012d:
            java.lang.Object r5 = A00(r7, r0)
            X.HIp r5 = (X.C54554HIp) r5
            X.GhS r2 = r5.A01
            if (r2 != 0) goto L_0x0141
            java.lang.String r0 = "nuxViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0141:
            X.0Ud r4 = r2.A0A
            r3 = 55
            X.IkU r2 = new X.IkU
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x0156
            return r1
        L_0x0153:
            X.0eS.A00(r7)
        L_0x0156:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x015b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0169
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0169:
            java.lang.Object r7 = A00(r7, r0)
            X.I4d r7 = (X.C56604I4d) r7
            androidx.fragment.app.Fragment r6 = X.C56604I4d.A09(r7)
            X.07U r5 = X.07U.A01
            r4 = 0
            r3 = 5
            X.ImL r2 = new X.ImL
            r2.<init>(r7, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r5, r6, r0, r2)
            goto L_0x094b
        L_0x0184:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0192
            if (r2 == r6) goto L_0x01ae
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0192:
            java.lang.Object r5 = A00(r7, r0)
            X.HIp r5 = (X.C54554HIp) r5
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r2 = r5.A02
            if (r2 == 0) goto L_0x01b6
            X.0Ud r4 = r2.A0B
            r3 = 56
            X.IkU r2 = new X.IkU
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x01b1
            return r1
        L_0x01ae:
            X.0eS.A00(r7)
        L_0x01b1:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x01b6:
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01be:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x01cc
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01cc:
            java.lang.Object r7 = A00(r7, r0)
            X.I4d r7 = (X.C56604I4d) r7
            androidx.fragment.app.Fragment r6 = X.C56604I4d.A09(r7)
            X.07U r5 = X.07U.A01
            r4 = 0
            r3 = 7
            X.ImL r2 = new X.ImL
            r2.<init>(r7, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r5, r6, r0, r2)
            goto L_0x094b
        L_0x01e7:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x01f5
            if (r2 == r6) goto L_0x021b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01f5:
            java.lang.Object r5 = A00(r7, r0)
            X.HIp r5 = (X.C54554HIp) r5
            X.Gh8 r2 = r5.A00
            if (r2 != 0) goto L_0x0209
            java.lang.String r0 = "feedbackViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0209:
            X.0Ud r4 = r2.A06
            r3 = 57
            X.IkU r2 = new X.IkU
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x021e
            return r1
        L_0x021b:
            X.0eS.A00(r7)
        L_0x021e:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0223:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0231
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0231:
            java.lang.Object r7 = A00(r7, r0)
            X.I4d r7 = (X.C56604I4d) r7
            androidx.fragment.app.Fragment r6 = X.C56604I4d.A09(r7)
            X.07U r5 = X.07U.A01
            r4 = 0
            r3 = 9
            X.ImL r2 = new X.ImL
            r2.<init>(r7, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r5, r6, r0, r2)
            goto L_0x094b
        L_0x024d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0291
            if (r2 != r6) goto L_0x02ac
            X.0eS.A00(r7)
        L_0x0259:
            X.I1a r7 = (X.C56546I1a) r7
            java.util.List r5 = r7.A00
        L_0x025d:
            java.lang.Object r0 = r0.A02
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r0 = (com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel) r0
            X.05G r4 = r0.A0A
            java.lang.Object r3 = r4.getValue()
            X.HtT r3 = (X.C56141HtT) r3
            java.lang.Object r0 = r4.getValue()
            X.HtT r0 = (X.C56141HtT) r0
            X.I1l r0 = r0.A02
            boolean r2 = r0.A03
            boolean r1 = r0.A01
            r0 = 0
            X.I1l r8 = new X.I1l
            r8.<init>(r5, r2, r0, r1)
            java.lang.String r10 = r3.A06
            java.lang.String r11 = r3.A05
            java.lang.String r12 = r3.A04
            X.HQa r7 = r3.A01
            X.I1e r6 = r3.A00
            X.I1f r9 = r3.A03
            X.HtT r5 = new X.HtT
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x028c:
            r4.Epw(r5)
            goto L_0x095e
        L_0x0291:
            java.lang.Object r4 = A00(r7, r0)
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r4 = (com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel) r4
            X.I1x r3 = r4.A07
            java.util.List r5 = r3.A09
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x025d
            com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository r2 = r4.A06
            r0.A00 = r6
            java.lang.Object r7 = r2.A03(r3, r0)
            if (r7 != r1) goto L_0x0259
            return r1
        L_0x02ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02b1:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x02bf
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02bf:
            java.lang.Object r6 = A00(r7, r0)
            r5 = 0
            r4 = 47
            r3 = 42
            X.MGC r2 = new X.MGC
            r2.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r5, (int) r4, (int) r3)
            r0.A00 = r8
            java.lang.Object r0 = X.19E.A00(r0, r2)
            goto L_0x094b
        L_0x02d5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x02e3
            if (r2 == r4) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02e3:
            java.lang.Object r2 = A00(r7, r0)
            X.Ghc r2 = (X.C53044Ghc) r2
            X.3ju r3 = r2.A0H
            X.HJA r2 = X.HJA.A00
            r0.A00 = r4
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x094b
        L_0x02f5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0303
            if (r2 == r5) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0303:
            java.lang.Object r2 = A00(r7, r0)
            X.Ghc r2 = (X.C53044Ghc) r2
            X.3ju r4 = r2.A0H
            r3 = 2131967825(0x7f133f51, float:1.9572527E38)
            X.HJ2 r2 = new X.HJ2
            r2.<init>(r3)
            r0.A00 = r5
            java.lang.Object r0 = r4.ELH(r2, r0)
            goto L_0x094b
        L_0x031b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0329
            if (r2 == r5) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0329:
            java.lang.Object r2 = A00(r7, r0)
            X.Ghc r2 = (X.C53044Ghc) r2
            X.3ju r4 = r2.A0H
            r3 = 2131961740(0x7f13278c, float:1.9560185E38)
            X.HJ2 r2 = new X.HJ2
            r2.<init>(r3)
            r0.A00 = r5
            java.lang.Object r0 = r4.ELH(r2, r0)
            goto L_0x094b
        L_0x0341:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x035a
            if (r2 != r5) goto L_0x0373
            X.0eS.A00(r7)
        L_0x034d:
            java.lang.Object r0 = r0.A02
            X.GgR r0 = (X.C52974GgR) r0
            X.8Vz r1 = r0.A0A
            X.8Vt r0 = X.C356928Vt.NONE
            r1.A00(r0)
            goto L_0x095e
        L_0x035a:
            java.lang.Object r2 = A00(r7, r0)
            X.GgR r2 = (X.C52974GgR) r2
            X.3ju r4 = r2.A0M
            r3 = 2131974093(0x7f1357cd, float:1.958524E38)
            X.HJF r2 = new X.HJF
            r2.<init>(r3)
            r0.A00 = r5
            java.lang.Object r2 = r4.ELH(r2, r0)
            if (r2 != r1) goto L_0x034d
            return r1
        L_0x0373:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0378:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0386
            if (r2 == r6) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0386:
            java.lang.Object r3 = A00(r7, r0)
            X.GgR r3 = (X.C52974GgR) r3
            X.3ju r5 = r3.A0M
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r2 = 44
            X.I8z r3 = X.C56719I8z.A00(r3, r2)
            X.HJE r2 = new X.HJE
            r2.<init>(r3, r4)
            r0.A00 = r6
            java.lang.Object r0 = r5.ELH(r2, r0)
            goto L_0x094b
        L_0x03a3:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x03b2
            if (r2 != r4) goto L_0x03ad
            goto L_0x03ca
        L_0x03ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03b2:
            X.0eS.A00(r7)
            java.lang.Object r2 = r0.A02     // Catch:{ HP1 -> 0x0427 }
            X.GgR r2 = (X.C52974GgR) r2     // Catch:{ HP1 -> 0x0427 }
            X.I1z r3 = r2.A0H     // Catch:{ HP1 -> 0x0427 }
            X.05G r2 = r3.A0G     // Catch:{ HP1 -> 0x0427 }
            X.AnonymousClass7TF.A1O(r2, r4)     // Catch:{ HP1 -> 0x0427 }
            r2 = 0
            r0.A00 = r4     // Catch:{ HP1 -> 0x0427 }
            java.lang.Object r2 = r3.A01(r0, r2)     // Catch:{ HP1 -> 0x0427 }
            if (r2 != r1) goto L_0x03cd
            return r1
        L_0x03ca:
            X.0eS.A00(r7)     // Catch:{ HP1 -> 0x0427 }
        L_0x03cd:
            java.lang.Object r3 = r0.A02     // Catch:{ HP1 -> 0x0427 }
            X.GgR r3 = (X.C52974GgR) r3     // Catch:{ HP1 -> 0x0427 }
            com.instagram.common.session.UserSession r1 = r3.A06     // Catch:{ HP1 -> 0x0427 }
            X.8A2 r1 = X.AnonymousClass8A1.A01(r1)     // Catch:{ HP1 -> 0x0427 }
            r1.A01()     // Catch:{ HP1 -> 0x0427 }
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r3.A0E     // Catch:{ HP1 -> 0x0427 }
            X.2Fk r2 = r1.A0C     // Catch:{ HP1 -> 0x0427 }
            X.2gO r1 = r3.A02     // Catch:{ HP1 -> 0x0427 }
            r2.A09(r1)     // Catch:{ HP1 -> 0x0427 }
            goto L_0x095e
        L_0x03e5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x03f4
            if (r2 != r4) goto L_0x03ef
            goto L_0x040c
        L_0x03ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03f4:
            X.0eS.A00(r7)
            java.lang.Object r2 = r0.A02     // Catch:{ HP1 -> 0x0427 }
            X.GgR r2 = (X.C52974GgR) r2     // Catch:{ HP1 -> 0x0427 }
            X.I1z r3 = r2.A0H     // Catch:{ HP1 -> 0x0427 }
            X.05G r2 = r3.A0G     // Catch:{ HP1 -> 0x0427 }
            X.AnonymousClass7TF.A1O(r2, r4)     // Catch:{ HP1 -> 0x0427 }
            r2 = 0
            r0.A00 = r4     // Catch:{ HP1 -> 0x0427 }
            java.lang.Object r2 = r3.A01(r0, r2)     // Catch:{ HP1 -> 0x0427 }
            if (r2 != r1) goto L_0x040f
            return r1
        L_0x040c:
            X.0eS.A00(r7)     // Catch:{ HP1 -> 0x0427 }
        L_0x040f:
            java.lang.Object r3 = r0.A02     // Catch:{ HP1 -> 0x0427 }
            X.GgR r3 = (X.C52974GgR) r3     // Catch:{ HP1 -> 0x0427 }
            com.instagram.common.session.UserSession r1 = r3.A06     // Catch:{ HP1 -> 0x0427 }
            X.8A2 r1 = X.AnonymousClass8A1.A01(r1)     // Catch:{ HP1 -> 0x0427 }
            r1.A01()     // Catch:{ HP1 -> 0x0427 }
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r3.A0E     // Catch:{ HP1 -> 0x0427 }
            X.2Fk r2 = r1.A0C     // Catch:{ HP1 -> 0x0427 }
            X.2gO r1 = r3.A03     // Catch:{ HP1 -> 0x0427 }
            r2.A09(r1)     // Catch:{ HP1 -> 0x0427 }
            goto L_0x095e
        L_0x0427:
            r1 = move-exception
            java.lang.Object r0 = r0.A02
            X.GgR r0 = (X.C52974GgR) r0
            X.C52974GgR.A06(r0, r1)
            goto L_0x095e
        L_0x0431:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x043f
            if (r2 == r6) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x043f:
            java.lang.Object r5 = A00(r7, r0)
            X.H18 r5 = (X.H18) r5
            X.0eM r2 = r5.A0G
            java.lang.Object r2 = r2.getValue()
            X.DlD r2 = (X.C46785DlD) r2
            if (r2 == 0) goto L_0x095e
            X.0Ud r4 = r2.A03
            r3 = 0
            r2 = 40
            X.ImP r2 = X.C58103ImP.A01(r5, r3, r2)
            r0.A00 = r6
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r4)
            goto L_0x094b
        L_0x0460:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x046e
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x046e:
            java.lang.Object r3 = A00(r7, r0)
            X.0lg r3 = (X.0lg) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            X.1NY r6 = X.DbU.A0M(r3)
            java.lang.String r5 = "api/"
            java.lang.String r4 = "v1/"
            java.lang.String r3 = "users/"
            java.lang.String r2 = "set_cutout_anything_nux_seen_state/"
            r6.A04()
            r6.A02()
            java.lang.String r2 = X.002.A0u(r5, r4, r3, r2)
            X.0qQ.A07(r2)
            r6.A0E = r2
            java.lang.Class<X.CCt> r3 = X.C43775CCt.class
            java.lang.Class<X.CyG> r2 = X.C45542CyG.class
            X.1OC r3 = X.DbU.A0S(r6, r3, r2)
            r2 = 8
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0qQ.A0C(r3, r2)
            r0.A00 = r8
            r2 = 1596010039(0x5f212e37, float:1.1614281E19)
            java.lang.Object r0 = r3.A00(r2, r0)
            goto L_0x094b
        L_0x04af:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x04bd
            if (r2 == r6) goto L_0x04dd
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04bd:
            java.lang.Object r5 = A00(r7, r0)
            X.Ggk r5 = (X.C52993Ggk) r5
            X.0eM r2 = r5.A00
            java.lang.Object r2 = r2.getValue()
            X.HDc r2 = (X.C54430HDc) r2
            X.0Ud r4 = r2.A02
            r3 = 66
            X.IkU r2 = new X.IkU
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x04e0
            return r1
        L_0x04dd:
            X.0eS.A00(r7)
        L_0x04e0:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x04e5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x04f3
            if (r2 == r4) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04f3:
            java.lang.Object r2 = A00(r7, r0)
            X.H2b r2 = (X.C54181H2b) r2
            X.3ju r3 = r2.A03
            X.HJa r2 = X.C54565HJa.A00
            r0.A00 = r4
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x094b
        L_0x0505:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0513
            if (r2 == r4) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0513:
            java.lang.Object r2 = A00(r7, r0)
            X.Gh4 r2 = (X.C53013Gh4) r2
            X.3ju r3 = r2.A00
            X.HJe r2 = X.C54569HJe.A00
            r0.A00 = r4
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x094b
        L_0x0525:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0533
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0533:
            java.lang.Object r6 = A00(r7, r0)
            X.GgK r6 = (X.C52967GgK) r6
            X.05G r5 = r6.A02
            r4 = 0
            r3 = 17
            X.ImE r2 = new X.ImE
            r2.<init>(r6, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r5)
            goto L_0x094b
        L_0x054b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0559
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0559:
            java.lang.Object r2 = A00(r7, r0)
            X.GhE r2 = (X.C53023GhE) r2
            X.3ju r6 = r2.A05
            com.instagram.api.schemas.TemplatesBrowserSectionSize r5 = com.instagram.api.schemas.TemplatesBrowserSectionSize.LARGE
            r4 = 0
            java.lang.String r3 = ""
            X.GSY r2 = new X.GSY
            r2.<init>((X.C276114sa) r4, (com.instagram.api.schemas.TemplatesBrowserSectionSize) r5, (java.lang.String) r3, (java.lang.String) r3)
            java.util.List r3 = X.AnonymousClass7TE.A1I(r2)
            X.HJg r2 = new X.HJg
            r2.<init>(r3)
            r0.A00 = r8
            java.lang.Object r0 = r6.ELH(r2, r0)
            goto L_0x094b
        L_0x057c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x058a
            if (r2 == r4) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x058a:
            java.lang.Object r2 = A00(r7, r0)
            X.GhE r2 = (X.C53023GhE) r2
            X.3ju r3 = r2.A05
            X.HJj r2 = X.C54574HJj.A00
            r0.A00 = r4
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x094b
        L_0x059c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x05aa
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05aa:
            java.lang.Object r6 = A00(r7, r0)
            X.H1B r6 = (X.H1B) r6
            X.0eM r2 = r6.A07
            java.lang.Object r2 = r2.getValue()
            X.Ggq r2 = (X.C52999Ggq) r2
            X.0Ud r5 = r2.A03
            r4 = 0
            r3 = 18
            X.ImE r2 = new X.ImE
            r2.<init>(r6, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r5)
            goto L_0x094b
        L_0x05ca:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x05d8
            if (r2 == r5) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05d8:
            java.lang.Object r4 = A00(r7, r0)
            X.2is r4 = (X.C227232is) r4
            com.instagram.common.session.UserSession r2 = X.C227232is.A01(r4)
            com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository r3 = X.C63303Kum.A00(r2)
            X.Hji r2 = new X.Hji
            r2.<init>(r4)
            r0.A00 = r5
            java.lang.Object r0 = r3.A01(r2, r0)
            goto L_0x094b
        L_0x05f3:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0601
            if (r3 == r2) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0601:
            X.0eS.A00(r7)
            r0.A00 = r2
            X.0gF r0 = X.C60340gF.A00
            goto L_0x094b
        L_0x060a:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0618
            if (r3 == r2) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0618:
            java.lang.Object r6 = A00(r7, r0)
            X.GLR r6 = (X.GLR) r6
            r0.A00 = r2
            X.GLa r2 = r6.A01
            if (r2 == 0) goto L_0x086c
            r5 = 0
            boolean r13 = r2.A04
            boolean r14 = r2.A06
            java.lang.String r8 = r2.A02
            java.lang.String r9 = r2.A03
            long r11 = r2.A01
            int r10 = r2.A00
            X.GLa r7 = new X.GLa
            r7.<init>(r8, r9, r10, r11, r13, r14)
            boolean r2 = X.GLR.A0A(r7, r6)
            if (r2 == 0) goto L_0x086c
            X.4hF r2 = r6.A04
            boolean r2 = r2 instanceof X.JSp
            if (r2 == 0) goto L_0x086c
            X.4HW r4 = r6.A05
            r3 = 11
            X.GPB r2 = new X.GPB
            r2.<init>(r6, r7, r5, r3)
            java.lang.Object r0 = r4.A00(r7, r0, r2)
            goto L_0x0949
        L_0x0651:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x065f
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x065f:
            java.lang.Object r10 = A00(r7, r0)
            X.GLR r10 = (X.GLR) r10
            r0.A00 = r8
            r3 = 0
            long r6 = android.os.SystemClock.uptimeMillis()
            r5 = 0
            X.GLa r2 = new X.GLa
            r4 = r3
            r9 = r8
            r2.<init>(r3, r4, r5, r6, r8, r9)
            r10.A00 = r2
            long r6 = android.os.SystemClock.uptimeMillis()
            X.GLa r2 = new X.GLa
            r8 = r5
            r9 = r5
            r2.<init>(r3, r4, r5, r6, r8, r9)
            r10.A01 = r2
            X.0sn r14 = X.0sn.A00
            r11 = r3
            r12 = r3
            r13 = r3
            r15 = r0
            r16 = r5
            java.lang.Object r0 = X.GLR.A04(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0949
        L_0x0691:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x069f
            if (r2 == r3) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x069f:
            java.lang.Object r2 = A00(r7, r0)
            X.GLR r2 = (X.GLR) r2
            r4 = 0
            r0.A00 = r3
            X.0sn r7 = X.0sn.A00
            r9 = 0
            r5 = r4
            r6 = r4
            r3 = r2
            r8 = r0
            java.lang.Object r0 = X.GLR.A04(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x094b
        L_0x06b5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 2
            r4 = 1
            if (r2 == 0) goto L_0x06c6
            if (r2 == r4) goto L_0x06d4
            if (r2 == r6) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06c6:
            X.0eS.A00(r7)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.A00 = r4
            java.lang.Object r2 = X.C241603Pv.A01(r0, r2)
            if (r2 != r1) goto L_0x06d7
            return r1
        L_0x06d4:
            X.0eS.A00(r7)
        L_0x06d7:
            java.lang.Object r7 = r0.A02
            X.GDM r7 = (X.GDM) r7
            com.instagram.common.session.UserSession r2 = r7.A03
            r4 = 0
            X.0xa r3 = X.AnonymousClass7TE.A0q(r2)
            java.lang.String r2 = "blend_direct_inbox_nux_seen_count"
            int r2 = r3.getInt(r2, r4)
            X.0xY r5 = r3.AR4()
            int r3 = r2 + 1
            java.lang.String r2 = "blend_viewer_nux_seen_count"
            r5.E5Z(r2, r3)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "blend_viewer_nux_last_shown_time_ms"
            r5.E5c(r2, r3)
            r5.apply()
            X.JU4 r3 = r7.A01
            X.Idq r2 = X.C57625Idq.A00
            r0.A00 = r6
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x094b
        L_0x070b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0719
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0719:
            java.lang.Object r6 = A00(r7, r0)
            X.GDR r6 = (X.GDR) r6
            X.05G r3 = r6.A01
            X.0qC r2 = new X.0qC
            r2.<init>(r3)
            X.0r6 r5 = X.AnonymousClass11E.A01(r2)
            r4 = 0
            r3 = 19
            X.ImE r2 = new X.ImE
            r2.<init>(r6, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r5)
            goto L_0x094b
        L_0x073a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0748
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0748:
            java.lang.Object r6 = A00(r7, r0)
            X.GDR r6 = (X.GDR) r6
            X.05G r3 = r6.A02
            X.0qC r2 = new X.0qC
            r2.<init>(r3)
            X.0r6 r5 = X.AnonymousClass11E.A01(r2)
            r4 = 0
            r3 = 38
            X.ImL r2 = new X.ImL
            r2.<init>(r6, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r5)
            goto L_0x094b
        L_0x0769:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0777
            if (r2 == r8) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0777:
            java.lang.Object r6 = A00(r7, r0)
            X.GL0 r6 = (X.GL0) r6
            X.05G r3 = r6.A00
            X.0qC r2 = new X.0qC
            r2.<init>(r3)
            X.0r6 r5 = X.AnonymousClass11E.A01(r2)
            r4 = 0
            r3 = 20
            X.ImE r2 = new X.ImE
            r2.<init>(r6, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r5)
            goto L_0x094b
        L_0x0798:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x07a6
            if (r2 == r6) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07a6:
            java.lang.Object r5 = A00(r7, r0)
            X.GCr r5 = (X.C52045GCr) r5
            r2 = 0
            X.1OC r4 = X.C52045GCr.A01(r5, r2)
            if (r4 == 0) goto L_0x07bb
            r3 = 1368380687(0x518fd50f, float:7.7219357E10)
            r2 = 2
            X.032 r2 = r4.A05(r3, r2)
        L_0x07bb:
            r0.A00 = r6
            java.lang.Object r0 = X.C52045GCr.A02(r5, r0, r2)
            goto L_0x094b
        L_0x07c3:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x07d1
            if (r2 == r6) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07d1:
            java.lang.Object r5 = A00(r7, r0)
            X.GCr r5 = (X.C52045GCr) r5
            X.1OC r4 = X.C52045GCr.A00(r5)
            r3 = 1368380687(0x518fd50f, float:7.7219357E10)
            r2 = 2
            X.032 r2 = r4.A05(r3, r2)
            r0.A00 = r6
            java.lang.Object r0 = X.C52045GCr.A02(r5, r0, r2)
            goto L_0x094b
        L_0x07eb:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x07f9
            if (r2 == r3) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07f9:
            java.lang.Object r2 = A00(r7, r0)
            X.GhC r2 = (X.C53021GhC) r2
            r0.A00 = r3
            java.lang.Object r0 = X.C53021GhC.A00(r2, r0)
            goto L_0x094b
        L_0x0807:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0815
            if (r2 == r3) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0815:
            java.lang.Object r2 = A00(r7, r0)
            X.JjL r2 = (X.C60317JjL) r2
            r0.A00 = r3
            java.lang.Object r0 = X.C60317JjL.A01(r2, r0)
            goto L_0x094b
        L_0x0823:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0839
            if (r2 == r5) goto L_0x084d
            if (r2 == r6) goto L_0x0834
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0834:
            X.0eS.A00(r7)
            goto L_0x095e
        L_0x0839:
            java.lang.Object r3 = A00(r7, r0)
            X.JjL r3 = (X.C60317JjL) r3
            java.util.List r2 = r3.A05
            r2.clear()
            r0.A00 = r5
            java.lang.Object r2 = X.C60317JjL.A01(r3, r0)
            if (r2 != r1) goto L_0x0850
            return r1
        L_0x084d:
            X.0eS.A00(r7)
        L_0x0850:
            java.lang.Object r4 = r0.A02
            X.JjL r4 = (X.C60317JjL) r4
            r0.A00 = r6
            X.1E8 r3 = r4.A02
            java.lang.String r2 = r4.A03
            X.1Xj r2 = r3.A02(r2)
            if (r2 == 0) goto L_0x086c
            boolean r2 = r2.A4l()
            if (r2 != r5) goto L_0x086c
            java.lang.Object r0 = X.C60317JjL.A02(r4, r0)
            goto L_0x0949
        L_0x086c:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x094b
        L_0x0870:
            java.lang.Object r2 = A00(r7, r0)
            X.I1z r2 = (X.C56569I1z) r2
            r0.A00 = r4
            X.05G r3 = r2.A0G
            boolean r3 = X.DbX.A1b(r3)
            if (r3 != 0) goto L_0x086c
            X.836 r3 = r2.A09
            X.0Ud r3 = r3.A03
            java.lang.Object r6 = r3.getValue()
            X.831 r6 = (X.AnonymousClass831) r6
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r2.A0A
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r3 = r3.A0K
            X.2Fk r3 = r3.A06
            java.lang.Object r7 = r3.A02()
            X.8fx r7 = (X.C361278fx) r7
            java.util.List r3 = r6.A01
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x086c
            if (r7 == 0) goto L_0x086c
            int r5 = r7.A00
            r3 = 3
            if (r5 != r3) goto L_0x086c
            java.lang.Object r3 = r7.A00()
            com.instagram.music.common.model.AudioOverlayTrack r3 = (com.instagram.music.common.model.AudioOverlayTrack) r3
            com.instagram.music.common.model.DownloadedTrack r3 = r3.A06
            if (r3 == 0) goto L_0x086c
            java.lang.Object r8 = r7.A00()
            com.instagram.music.common.model.AudioOverlayTrack r8 = (com.instagram.music.common.model.AudioOverlayTrack) r8
            com.instagram.music.common.model.DownloadedTrack r3 = r8.A06
            X.0qQ.A0A(r3)
            java.lang.String r7 = r3.A02
            com.instagram.music.common.model.DownloadedTrack r5 = r8.A06
            X.0qQ.A0A(r5)
            int r3 = r8.A03
            int r21 = r5.A00(r3)
            com.instagram.music.common.model.DownloadedTrack r3 = r8.A06
            X.0qQ.A0A(r3)
            int r3 = r3.A00
            r12 = 0
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            X.A9u r14 = new X.A9u
            r15 = r18
            r16 = r15
            r17 = r7
            r20 = r19
            r22 = r3
            r23 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.of(r14)
            X.3ju r11 = r2.A0E
            java.util.ArrayList r3 = r6.A05()
            com.google.common.collect.ImmutableList r16 = X.AnonymousClass51Q.A01(r3)
            X.0qQ.A0A(r15)
            X.0sn r7 = X.0sn.A00
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.of()
            r8 = 2
            X.0qQ.A0B(r15, r8)
            X.AnonymousClass7TG.A1S(r7, r6)
            X.J5e r5 = X.C59071J5e.A00
            android.app.Application r3 = r2.A02
            android.content.res.AssetManager r3 = r3.getAssets()
            X.0qQ.A07(r3)
            X.8o1 r13 = new X.8o1
            r13.<init>(r3, r4)
            X.8pA r14 = new X.8pA
            r14.<init>(r12)
            com.instagram.common.session.UserSession r10 = r2.A08
            X.0Tu r9 = X.0Tu.A05
            r2 = 36327559239186946(0x810fb900023a02, double:3.0370329699771286E-306)
            boolean r26 = X.182.A06(r9, r10, r2)
            r23 = 1058013184(0x3f100000, float:0.5625)
            X.0qQ.A0B(r5, r8)
            r22 = 0
            r20 = r18
            r24 = r12
            r25 = r4
            r21 = r5
            r19 = r7
            r17 = r6
            X.4aP r2 = X.AHK.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r3 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r3.<init>(r2)
            X.H2x r2 = new X.H2x
            r2.<init>(r3)
            java.lang.Object r0 = r11.ELH(r2, r0)
        L_0x0949:
            if (r0 != r1) goto L_0x086c
        L_0x094b:
            if (r0 != r1) goto L_0x095e
            return r1
        L_0x094e:
            X.0eS.A00(r7)
            int r1 = r0.A00
            java.lang.Object r0 = r0.A02
            X.GDR r0 = (X.GDR) r0
            X.Hqu r0 = r0.A00
            if (r0 == 0) goto L_0x095e
            r0.A00(r1)
        L_0x095e:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58099ImL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, C58099ImL imL) {
        0eS.A00(obj);
        return imL.A02;
    }
}
