package X;

import android.view.View;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Geg  reason: case insensitive filesystem */
public final class C52906Geg extends C267794cD implements AnonymousClass5VF, C268824e3 {
    public C57530IcI A00;
    public String A01;
    public C268064ch A02;
    public Integer A03;
    public String A04;
    public final JQQ A05;
    public final AnonymousClass49S A06;

    public C52906Geg(JQQ jqq, AnonymousClass49S r3, Integer num, String str, String str2) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A04 = str2;
        this.A03 = num;
        this.A06 = r3;
        this.A05 = jqq;
    }

    public final void DXL(C268064ch r2) {
        0qQ.A0B(r2, 0);
        if (r2 != this.A02) {
            this.A02 = r2;
            A00();
        }
    }

    public final /* synthetic */ void Dd8(long j) {
    }

    private final void A00() {
        String str;
        JR0 icF;
        String str2;
        C267314bM r1 = C56599I3p.A00;
        C55609HkU hkU = (C55609HkU) C288795cU.A00(r1, this);
        if (hkU != null) {
            String str3 = this.A01;
            0qQ.A0B(str3, 0);
            hkU.A00.A01(str3, (View) null);
        }
        this.A00 = null;
        C268064ch r0 = this.A02;
        if (r0 != null) {
            C57530IcI icI = new C57530IcI(r0);
            this.A00 = icI;
            String A1F = C51966G9m.A1F(C288795cU.A00(C286915Yh.A00, this));
            String str4 = this.A04;
            if (str4 == null) {
                switch (this.A03.intValue()) {
                    case 1:
                        str2 = "feed_netego";
                        break;
                    case 2:
                        str2 = AnonymousClass000.A00(3117);
                        break;
                    case 3:
                        str2 = AnonymousClass000.A00(3118);
                        break;
                    case 4:
                        str2 = "feed_video";
                        break;
                    case 5:
                        str2 = "feed_comment";
                        break;
                    case 6:
                        str2 = "feed_hscroll_ad";
                        break;
                    case 7:
                        str2 = "feed_multi_ads";
                        break;
                    case 8:
                        str2 = "feed_contextual_keyword";
                        break;
                    case 9:
                        str2 = "ad_story";
                        break;
                    case 10:
                        str2 = "story";
                        break;
                    case 11:
                        str2 = "story_ads";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str2 = "story_comment";
                        break;
                    case 13:
                        str2 = C273654mx.A00(397);
                        break;
                    case 14:
                        str2 = "explore";
                        break;
                    case 15:
                        str2 = "explore_grid";
                        break;
                    case 16:
                        str2 = "search_grid";
                        break;
                    case 17:
                        str2 = "reels_ads";
                        break;
                    case EglBase14Impl.EGLExt_SDK_VERSION:
                        str2 = "reels_netego";
                        break;
                    case 19:
                        str2 = "reels_multi_ads";
                        break;
                    case 20:
                        str2 = "updates_hub";
                        break;
                    case 21:
                        str2 = "bcn_text_feed";
                        break;
                    default:
                        str2 = "feed";
                        break;
                }
                icF = new C57526IcE(this.A06, icI, str2, A1F, this.A01);
            } else {
                AnonymousClass49S r5 = this.A06;
                switch (this.A03.intValue()) {
                    case 1:
                        str = "feed_netego";
                        break;
                    case 2:
                        str = AnonymousClass000.A00(3117);
                        break;
                    case 3:
                        str = AnonymousClass000.A00(3118);
                        break;
                    case 4:
                        str = "feed_video";
                        break;
                    case 5:
                        str = "feed_comment";
                        break;
                    case 6:
                        str = "feed_hscroll_ad";
                        break;
                    case 7:
                        str = "feed_multi_ads";
                        break;
                    case 8:
                        str = "feed_contextual_keyword";
                        break;
                    case 9:
                        str = "ad_story";
                        break;
                    case 10:
                        str = "story";
                        break;
                    case 11:
                        str = "story_ads";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str = "story_comment";
                        break;
                    case 13:
                        str = C273654mx.A00(397);
                        break;
                    case 14:
                        str = "explore";
                        break;
                    case 15:
                        str = "explore_grid";
                        break;
                    case 16:
                        str = "search_grid";
                        break;
                    case 17:
                        str = "reels_ads";
                        break;
                    case EglBase14Impl.EGLExt_SDK_VERSION:
                        str = "reels_netego";
                        break;
                    case 19:
                        str = "reels_multi_ads";
                        break;
                    case 20:
                        str = "updates_hub";
                        break;
                    case 21:
                        str = "bcn_text_feed";
                        break;
                    default:
                        str = "feed";
                        break;
                }
                icF = new C57527IcF(r5, icI, str, A1F, this.A01, str4);
            }
            JR0 jr0 = icF;
            C55609HkU hkU2 = (C55609HkU) C288795cU.A00(r1, this);
            if (hkU2 != null) {
                JQQ jqq = this.A05;
                0qQ.A0B(jqq, 1);
                hkU2.A00.A00((C55513Hiv) null, jqq, jr0);
            }
        }
    }

    public final void A0F() {
        C55609HkU hkU = (C55609HkU) C288795cU.A00(C56599I3p.A00, this);
        if (hkU != null) {
            String str = this.A01;
            0qQ.A0B(str, 0);
            hkU.A00.A01(str, (View) null);
        }
        this.A00 = null;
        this.A02 = null;
    }

    public final void A0H(String str, Integer num, String str2) {
        DbY.A1S(str, num);
        if (!0qQ.A0K(this.A01, str) || !0qQ.A0K(this.A04, str2) || this.A03 != num) {
            this.A01 = str;
            this.A04 = str2;
            this.A03 = num;
            A00();
        }
    }
}
