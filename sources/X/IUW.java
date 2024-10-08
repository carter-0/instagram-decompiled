package X;

import android.app.Activity;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.regex.Pattern;

public final class IUW implements JQH {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ MediaControlEventSourceEnum A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ JSw A05;
    public final /* synthetic */ AnonymousClass3W1 A06;

    public IUW(Activity activity, MediaControlEventSourceEnum mediaControlEventSourceEnum, AnonymousClass0iw r3, UserSession userSession, 1Xj r5, JSw jSw, AnonymousClass3W1 r7) {
        this.A01 = mediaControlEventSourceEnum;
        this.A05 = jSw;
        this.A04 = r5;
        this.A06 = r7;
        this.A00 = activity;
        this.A03 = userSession;
        this.A02 = r3;
    }

    public final void Cyh(C54696HPb hPb) {
        if (hPb instanceof HBD) {
            HBD hbd = (HBD) hPb;
            C246193eB r1 = hbd.A01;
            AnonymousClass1eD r0 = hbd.A00;
            1Xj r3 = this.A04;
            AnonymousClass3W1 r5 = this.A06;
            I71.A04(r0, r1, this.A01, r3, this.A05, r5);
            C55015Ham.A00(this.A02, this.A03, r3);
        } else if (hPb instanceof HBE) {
            HBE hbe = (HBE) hPb;
            C246193eB r32 = hbe.A01;
            AnonymousClass1eD r2 = hbe.A00;
            if (r32 == null || (!00k.A0u(C55340Hg8.A00, C56315HwS.A00(r32)))) {
                I71.A04(r2, r32, (MediaControlEventSourceEnum) null, this.A04, this.A05, this.A06);
            }
        }
    }

    public final void DGa(AnonymousClass1eD r19, C246193eB r20) {
        Activity activity = this.A00;
        1Xj r6 = this.A04;
        AnonymousClass3W1 r0 = this.A06;
        JSw jSw = this.A05;
        MediaControlEventSourceEnum mediaControlEventSourceEnum = this.A01;
        C246193eB r10 = r20;
        C54667HMy A002 = C56315HwS.A00(r10);
        if (A002 != null) {
            AnonymousClass1eD r9 = r19;
            switch (A002.ordinal()) {
                case 0:
                    C2363233h C87 = jSw.C87();
                    String str = r0.A1V;
                    Pattern pattern = 0mp.A00;
                    if (str == null) {
                        str = "";
                    }
                    C87.Eul(r6, r0, str);
                    return;
                case 10:
                    String id = r6.getId();
                    if (id != null) {
                        C16677UzD uzD = C16677UzD.MEDIA;
                        1Xj r11 = r6;
                        AnonymousClass3W1 r13 = r0;
                        jSw.Ev9(r11, new IUY(activity, r9, r10, r11, jSw, r13), r13, uzD, id);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                case 11:
                    jSw.E13(r6, new IUY(activity, r9, r10, r6, jSw, r0), r0);
                    return;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    jSw.EuI(r6, new IUY(activity, r9, r10, r6, jSw, r0), r0);
                    return;
                case 13:
                    jSw.C87().EuJ(r6, r0);
                    return;
                case 19:
                    jSw.C87().E0t(AnonymousClass05K.A01);
                    return;
                case 24:
                    jSw.C87().Cfd(r6, "bottom_sheet");
                    return;
                default:
                    r0.A1H = r10.getId();
                    r0.A1G = r10.getData();
                    C2363233h C872 = jSw.C87();
                    String id2 = r6.getId();
                    if (id2 != null) {
                        String C9L = r6.C9L();
                        int position = r0.getPosition();
                        C872.Ds5(r6.B5J(), r6, id2, C9L, r10.getId(), r10.getData(), (String) null, r0.A1V, -1, position, true, false, AnonymousClass7TF.A1W(mediaControlEventSourceEnum, MediaControlEventSourceEnum.ON_IMPRESSION));
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 == 5) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DuW() {
        /*
            r9 = this;
            com.instagram.api.schemas.MediaControlEventSourceEnum r2 = r9.A01
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x000d
            r0 = 5
            r7 = 0
            if (r1 != r0) goto L_0x000e
        L_0x000d:
            r7 = 1
        L_0x000e:
            X.JSw r0 = r9.A05
            X.33h r3 = r0.C87()
            X.1Xj r4 = r9.A04
            X.3W1 r5 = r9.A06
            java.lang.String r6 = r2.A00
            r8 = 0
            r3.DkW(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IUW.DuW():void");
    }
}
