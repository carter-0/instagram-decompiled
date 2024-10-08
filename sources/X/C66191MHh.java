package X;

import android.view.View;
import com.facebook.avatar.expresso.instagram.ExpressoImpl;
import com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;
import java.util.concurrent.CancellationException;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MHh  reason: case insensitive filesystem */
public final class C66191MHh extends AnonymousClass1Ek implements 0sK {
    public Object A00;
    public final int A01;

    public static C62180ro A00(Object obj, AnonymousClass0r6 r3, int i) {
        return new C62180ro(new C66191MHh(obj, (AnonymousClass4D7) null, i), r3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66191MHh(Object obj, AnonymousClass4D7 r3, int i) {
        super(3, r3);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r1 = new X.C66191MHh(r0, r6);
        r1.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        r1 = new X.C66191MHh(r0, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r1 = new X.C66191MHh(r2, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        return r1.invokeSuspend(X.C60340gF.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x001c;
                case 2: goto L_0x0020;
                case 3: goto L_0x0026;
                case 4: goto L_0x002c;
                case 5: goto L_0x0037;
                case 6: goto L_0x003d;
                case 7: goto L_0x0043;
                case 8: goto L_0x0049;
                case 9: goto L_0x0050;
                case 10: goto L_0x0057;
                case 11: goto L_0x005e;
                case 12: goto L_0x0063;
                case 13: goto L_0x0068;
                case 14: goto L_0x006d;
                case 15: goto L_0x0079;
                case 16: goto L_0x0080;
                case 17: goto L_0x0087;
                case 18: goto L_0x008e;
                case 19: goto L_0x0095;
                case 20: goto L_0x009c;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r2 = r3.A00
            r0 = 21
        L_0x000b:
            X.MHh r1 = new X.MHh
            r1.<init>(r2, r6, r0)
        L_0x0010:
            X.0gF r0 = X.C60340gF.A00
            java.lang.Object r0 = r1.invokeSuspend(r0)
            return r0
        L_0x0017:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            r2 = 0
            r0 = 0
            goto L_0x000b
        L_0x001c:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            r0 = 1
            goto L_0x0071
        L_0x0020:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 2
            goto L_0x00a2
        L_0x0026:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 3
            goto L_0x00a2
        L_0x002c:
            java.lang.Number r5 = (java.lang.Number) r5
            r5.floatValue()
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 4
            goto L_0x00a2
        L_0x0037:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 5
            goto L_0x00a2
        L_0x003d:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 6
            goto L_0x00a2
        L_0x0043:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 7
            goto L_0x00a2
        L_0x0049:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 8
            goto L_0x00a2
        L_0x0050:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 9
            goto L_0x00a2
        L_0x0057:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 10
            goto L_0x00a2
        L_0x005e:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            r0 = 11
            goto L_0x0071
        L_0x0063:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            r0 = 12
            goto L_0x0071
        L_0x0068:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            r0 = 13
            goto L_0x0071
        L_0x006d:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            r0 = 14
        L_0x0071:
            X.MHh r1 = new X.MHh
            r1.<init>(r0, r6)
            r1.A00 = r5
            goto L_0x0010
        L_0x0079:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 15
            goto L_0x00a2
        L_0x0080:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 16
            goto L_0x00a2
        L_0x0087:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 17
            goto L_0x00a2
        L_0x008e:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 18
            goto L_0x00a2
        L_0x0095:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 19
            goto L_0x00a2
        L_0x009c:
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            java.lang.Object r0 = r3.A00
            r2 = 20
        L_0x00a2:
            X.MHh r1 = new X.MHh
            r1.<init>(r0, r6, r2)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66191MHh.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A01) {
            case 0:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 14:
                0eS.A00(obj);
                break;
            case 1:
                0eS.A00(obj);
                0KC.A0C(ExpressoImpl.A0B, ((Throwable) this.A00).getMessage());
                break;
            case 2:
                0eS.A00(obj);
                ((OdrSnapshotHelper) this.A00).A07.markerPoint(603995461, "/take_snapshot/encode_frame_end");
                break;
            case 3:
                0eS.A00(obj);
                LB4 lb4 = (LB4) this.A00;
                int i = lb4.A00 - 1;
                lb4.A00 = i;
                if (i == 0) {
                    C71004OWb.A00.A00("SessionAudioLevelsProvider", "No more collectors. Stopping audio level updates.");
                    C262204Co r0 = lb4.A04;
                    if (r0 != null) {
                        r0.AG7((CancellationException) null);
                    }
                    lb4.A04 = null;
                    break;
                }
                break;
            case 4:
                0eS.A00(obj);
                DbS.A1U(this.A00);
                break;
            case 5:
                0eS.A00(obj);
                ((C55999Hr5) this.A00).A00(true);
                break;
            case 6:
                0eS.A00(obj);
                ((AnonymousClass6D9) this.A00).A03("fragment_paused");
                break;
            case 7:
                0eS.A00(obj);
                JTP.A1B(((C46772Dkz) this.A00).A01, false);
                break;
            case 8:
                0eS.A00(obj);
                C51967G9n.A16((C284945Oz) this.A00, true);
                break;
            case 9:
                0eS.A00(obj);
                OIF oif = (OIF) this.A00;
                if (false != oif.A05) {
                    oif.A05 = false;
                    AnonymousClass7TE.A1U(oif.A02, true);
                    break;
                }
                break;
            case 10:
                0eS.A00(obj);
                C68687NSt nSt = (C68687NSt) this.A00;
                C68687NSt.A00(nSt, false);
                nSt.CL9(true);
                break;
            case 11:
            case 13:
                0eS.A00(obj);
                ((Throwable) this.A00).getMessage();
                break;
            case 15:
                0eS.A00(obj);
                ((LR8) this.A00).A02();
                break;
            case 16:
                0eS.A00(obj);
                ((C55955HqJ) this.A00).A00();
                break;
            case 17:
                0eS.A00(obj);
                ((C55870Hor) this.A00).A04.A0A("fragment_paused");
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                0eS.A00(obj);
                Ho1 ho1 = (Ho1) this.A00;
                C55550HjW hjW = ho1.A00;
                if (hjW != null) {
                    ho1.A02.A00.remove(hjW);
                }
                ho1.A00 = null;
                break;
            case 21:
                0eS.A00(obj);
                ((View) this.A00).setClickable(true);
                break;
            default:
                0eS.A00(obj);
                C56661I6q i6q = ((WriteSuggestionsRepository) this.A00).A03;
                C56661I6q.A03(i6q, "query_end");
                C56661I6q.A02(i6q, "query_end");
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66191MHh(int i, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A01 = i;
    }
}
