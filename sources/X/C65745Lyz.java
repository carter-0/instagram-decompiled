package X;

import android.view.View;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Lyz  reason: case insensitive filesystem */
public final class C65745Lyz implements C273414mX {
    public final int A00;
    public final Object A01;

    public C65745Lyz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C331127Pr r1, Object obj, int i) {
        r1.A0U = new C65745Lyz(obj, i);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1qK, java.lang.Object] */
    public final void Cyc() {
        switch (this.A00) {
            case 0:
                0xY A0p = AnonymousClass7TE.A0p((1Av) this.A01);
                A0p.E5T(C273654mx.A00(362), true);
                A0p.apply();
                return;
            case 1:
                ((C61364K4g) this.A01).A0G();
                return;
            case 2:
                ((C64969Ll8) this.A01).A05.CxD();
                return;
            case 3:
                LG7 lg7 = (LG7) this.A01;
                C331127Pr r1 = lg7.A03;
                if (r1 != null) {
                    r1.A0T = null;
                }
                lg7.A02 = null;
                return;
            case 4:
                C65104LnR lnR = (C65104LnR) this.A01;
                AudioOverlayTrack audioOverlayTrack = lnR.A01;
                if (audioOverlayTrack != null) {
                    C65104LnR.A00(lnR, audioOverlayTrack, false);
                    return;
                }
                return;
            case 5:
                C65104LnR lnR2 = (C65104LnR) this.A01;
                if (lnR2.A02) {
                    lnR2.A01();
                    return;
                }
                return;
            case 6:
            case 8:
            case 22:
                return;
            case 7:
                ((C65171Loa) this.A01).A0A.A07.Epw((Object) null);
                return;
            case 10:
                ((C384879i2) this.A01).A0T = false;
                return;
            case 11:
                IgEditText igEditText = ((C68449NIn) this.A01).A0H;
                if (igEditText != null) {
                    C69979NvJ.A00(igEditText);
                    return;
                }
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C68449NIn nIn = (C68449NIn) this.A01;
                IgEditText igEditText2 = nIn.A0H;
                if (igEditText2 != null) {
                    C69979NvJ.A00(igEditText2);
                    27p.A01(nIn.A0i()).A03.A01();
                    C63141Ks9.A00(nIn.A0i());
                    return;
                }
                break;
            case 14:
                K3N k3n = (K3N) this.A01;
                k3n.A0G();
                C61981KUe kUe = C61981KUe.A00;
                0qQ.A0B(kUe, 0);
                ((C60153JgY) k3n.A05.getValue()).A02.Epw(kUe);
                return;
            case 15:
                AJ9 aj9 = (AJ9) this.A01;
                aj9.A0B = true;
                AJ9.A04(aj9);
                return;
            case 16:
                ((AJ9) this.A01).A0J.A0H();
                return;
            case 17:
                C314546iR.A00((C314546iR) this.A01).A07();
                return;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C314226hr r12 = (C314226hr) this.A01;
                r12.A0l.invoke();
                C314226hr.A0D(r12);
                return;
            case 20:
                C273384mU r0 = (C273384mU) this.A01;
                if (r0 != null) {
                    r0.EHd();
                    return;
                }
                return;
            case 21:
                AnonymousClass1Nd.A00(((LBK) this.A01).A05).A05(new Object());
                return;
            default:
                DbS.A1U(this.A01);
                return;
        }
        0qQ.A0F("noteEditText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cyf() {
        switch (this.A00) {
            case 3:
                try {
                    C331157Pu r0 = ((LG7) this.A01).A02;
                    if (r0 != null) {
                        r0.A05();
                        return;
                    }
                    return;
                } catch (IllegalStateException e) {
                    0kD.A07("AlbumPicker", AnonymousClass000.A00(1325), e);
                    return;
                }
            case 6:
                C60304Jj3 jj3 = (C60304Jj3) this.A01;
                C60304Jj3.A01(jj3, false);
                AddChannelsRowChannelInfo addChannelsRowChannelInfo = jj3.A00;
                if (addChannelsRowChannelInfo != null) {
                    C313756gx A0R = DbZ.A0R(jj3.A04);
                    List A1I = AnonymousClass7TE.A1I(addChannelsRowChannelInfo.A01);
                    1Ln A0J = DbT.A0J(A0R);
                    if (DbT.A1Y(A0J)) {
                        DbW.A17(A0J, A0R);
                        DbV.A1M(A0J, "selected_tagged_channels");
                        A0J.A0p("done_button");
                        Dba.A1E(A0J, "tag_channels_sheet");
                        A0J.A0s((String) null);
                        JTT.A1F(A0J, A0R, (Long) null);
                        A0J.A0w(AnonymousClass7TF.A0w("ig_thread_ids", A1I.toString()));
                        A0J.Cgf();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((C65170LoZ) this.A01).A01.A07.Epw((Object) null);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C68449NIn nIn = (C68449NIn) this.A01;
                if (C68449NIn.A0h(nIn)) {
                    C67761MuH A02 = C68449NIn.A02(nIn);
                    A02.A0E.Epw(C69314NjF.PROMPT_NOTE);
                    C67761MuH.A02(A02);
                    return;
                }
                return;
            case 22:
                0nA.A0N((View) this.A01);
                return;
            default:
                return;
        }
    }
}
