package X;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashMap;

/* renamed from: X.6Sa  reason: invalid class name and case insensitive filesystem */
public final class C307926Sa implements AnonymousClass6Z1 {
    public C15630Ufw A00;
    public C15631Ufx A01;
    public C255773uh A02;
    public String A03;
    public boolean A04;
    public OEM A05;
    public Runnable A06;
    public final Activity A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;
    public final C273384mU A0A;
    public final String A0B;
    public final String A0C;

    public C307926Sa(Activity activity, AnonymousClass0iw r3, UserSession userSession, C273384mU r5, String str, String str2) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(str, 5);
        0qQ.A0B(str2, 6);
        this.A07 = activity;
        this.A09 = userSession;
        this.A0A = r5;
        this.A08 = r3;
        this.A0B = str;
        this.A0C = str2;
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final /* synthetic */ void DWT(String str) {
    }

    public final /* synthetic */ void Dfe() {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final void A00() {
        OEM oem;
        View view;
        Runnable runnable = this.A06;
        if (!(runnable == null || (oem = this.A05) == null || (view = (View) oem.A02.getValue()) == null)) {
            view.removeCallbacks(runnable);
        }
        this.A06 = null;
        OEM oem2 = this.A05;
        if (oem2 != null) {
            oem2.A00.setVisibility(8);
        }
    }

    public final void A01() {
        C20057WkH wkH;
        long j;
        String str;
        long j2;
        Long l;
        1Xj r0;
        1Xj r02;
        String A30;
        Long A0n;
        Long A0n2;
        C17445VVy vVy;
        String str2;
        Long A0n3;
        View view;
        if (this.A01 != null || this.A00 != null) {
            OEM oem = this.A05;
            if (oem != null) {
                oem.A00.setVisibility(0);
            }
            OEM oem2 = this.A05;
            if (oem2 == null || (view = (View) oem2.A02.getValue()) == null) {
                wkH = null;
            } else {
                wkH = new C20057WkH(this);
                view.postDelayed(wkH, 7500);
            }
            this.A06 = wkH;
            C273384mU r3 = this.A0A;
            r3.EHY("media_level_survey_shown");
            C15631Ufx ufx = this.A01;
            String str3 = "";
            long j3 = -1;
            if (ufx != null) {
                String str4 = ufx.A01;
                if (str4 != null) {
                    str3 = str4;
                }
                C17444VVx vVx = ufx.A00;
                if (vVx == null || (vVy = vVx.A01) == null || (str2 = vVy.A00) == null || (A0n3 = 00y.A0n(10, str2)) == null) {
                    j = -1;
                } else {
                    j = A0n3.longValue();
                }
                String str5 = this.A03;
                if (!(str5 == null || (A0n2 = 00y.A0n(10, str5)) == null)) {
                    j3 = A0n2.longValue();
                }
            } else {
                C15630Ufw ufw = this.A00;
                if (!(ufw == null || (str = ufw.A01) == null)) {
                    str3 = str;
                }
                j3 = Long.parseLong("1750502288572541");
                j = -1;
            }
            C255773uh Au5 = r3.Au5();
            C250973mM r6 = ((ReelViewerFragment) r3).A0a;
            String str6 = this.A0C;
            String str7 = this.A0B;
            if (Au5 == null || (r02 = Au5.A0b) == null || (A30 = r02.A30()) == null || (A0n = 00y.A0n(10, A30)) == null) {
                j2 = -1;
            } else {
                j2 = A0n.longValue();
            }
            String str8 = null;
            if (r6 != null) {
                l = Long.valueOf((long) r6.A0E);
            } else {
                l = null;
            }
            if (!(Au5 == null || (r0 = Au5.A0b) == null)) {
                str8 = r0.A0C.getLoggingInfoToken();
            }
            VI4.A00(this.A09).A02(new C18509Vt6(Long.valueOf(j2), l, str8, str6, str7), str3, this.A08.getModuleName(), j, j3);
        }
    }

    public final boolean A02() {
        View view;
        OEM oem = this.A05;
        if (oem == null || (view = (View) oem.A02.getValue()) == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final void D7Q(C255773uh r49, C250973mM r50, C316026kz r51, C309426Yf r52) {
        String str;
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Double d9;
        Double d10;
        Double d11;
        Double d12;
        Double d13;
        Double d14;
        Double d15;
        String loggingInfoToken;
        C316026kz r2 = r51;
        0qQ.A0B(r2, 0);
        C255773uh r5 = r49;
        0qQ.A0B(r5, 1);
        C250973mM r11 = r50;
        0qQ.A0B(r11, 3);
        if (!0qQ.A0K(this.A02, r5)) {
            Double d16 = null;
            this.A01 = null;
            this.A00 = null;
            this.A04 = false;
            this.A02 = r5;
            if (r2 instanceof C316006kx) {
                UserSession userSession = this.A09;
                LNc lNc = LNc.A00;
                if (lNc.A00(userSession, r5, r11) != null) {
                    this.A05 = ((C316006kx) r2).A0G;
                    String A002 = lNc.A00(userSession, r5, r11);
                    this.A03 = A002;
                    if (A002 == null) {
                        return;
                    }
                    if (!182.A06(0Tu.A05, userSession, 36320429593665961L)) {
                        String str2 = this.A0B;
                        String str3 = this.A0C;
                        AnonymousClass3HV r1 = r11.A0H.A0M;
                        1Xj r12 = r5.A0b;
                        if (r12 != null) {
                            str = r12.A30();
                        } else {
                            str = null;
                        }
                        String str4 = "";
                        if (str == null) {
                            str = str4;
                        }
                        0eP r0 = new 0eP("media_id", str);
                        0eP r02 = new 0eP("position_in_tray", String.valueOf(r11.A0E));
                        if (!(r12 == null || (loggingInfoToken = r12.A0C.getLoggingInfoToken()) == null)) {
                            str4 = loggingInfoToken;
                        }
                        0eP r03 = new 0eP("ranking_info_token", str4);
                        0eP r04 = new 0eP("tray_session_id", str2);
                        0eP r05 = new 0eP("viewer_session_id", str3);
                        if (r1 != null) {
                            d = r1.A0U;
                        } else {
                            d = null;
                        }
                        0eP r06 = new 0eP("stories_normalized_ptime_spent_gpu", String.valueOf(d));
                        if (r1 != null) {
                            d2 = r1.A0O;
                        } else {
                            d2 = null;
                        }
                        0eP r07 = new 0eP("is_reciprocal_convos_send_mtml", String.valueOf(d2));
                        if (r1 != null) {
                            d3 = r1.A0K;
                        } else {
                            d3 = null;
                        }
                        0eP r08 = new 0eP("pviewer_or_author_contact", String.valueOf(d3));
                        if (r1 != null) {
                            d4 = r1.A0T;
                        } else {
                            d4 = null;
                        }
                        0eP r09 = new 0eP("stories_ptap_new_mtml_gpu", String.valueOf(d4));
                        if (r1 != null) {
                            d5 = r1.A0L;
                        } else {
                            d5 = null;
                        }
                        0eP r010 = new 0eP("stories_evpvd_mtml_gpu", String.valueOf(d5));
                        if (r1 != null) {
                            d6 = r1.A04;
                        } else {
                            d6 = null;
                        }
                        0eP r011 = new 0eP("stories_emeimps_rate_mtml_gpu", String.valueOf(d6));
                        if (r1 != null) {
                            d7 = r1.A0N;
                        } else {
                            d7 = null;
                        }
                        0eP r012 = new 0eP("stories_pnext_pos_gpu", String.valueOf(d7));
                        if (r1 != null) {
                            d8 = r1.A05;
                        } else {
                            d8 = null;
                        }
                        0eP r14 = new 0eP("stories_preply_bar_tap_time_spent_rate_3_5_sec_gpu", String.valueOf(d8));
                        if (r1 != null) {
                            d9 = r1.A0M;
                        } else {
                            d9 = null;
                        }
                        0eP r13 = new 0eP("stories_plike_mtml_gpu", String.valueOf(d9));
                        if (r1 != null) {
                            d10 = r1.A0S;
                        } else {
                            d10 = null;
                        }
                        0eP r122 = new 0eP("stories_pskip_photos_075_videos_085_gpu", String.valueOf(d10));
                        if (r1 != null) {
                            d11 = r1.A0P;
                        } else {
                            d11 = null;
                        }
                        0eP r112 = new 0eP("stories_preply_bar_tap_time_spent_3_5_sec_gpu", String.valueOf(d11));
                        if (r1 != null) {
                            d12 = r1.A00;
                        } else {
                            d12 = null;
                        }
                        0eP r10 = new 0eP("adjust_ide_holdout_scores", String.valueOf(d12));
                        if (r1 != null) {
                            d13 = r1.A01;
                        } else {
                            d13 = null;
                        }
                        0eP r9 = new 0eP("adjust_integrity_scores", String.valueOf(d13));
                        if (r1 != null) {
                            d14 = r1.A02;
                        } else {
                            d14 = null;
                        }
                        0eP r8 = new 0eP("bff_scores", String.valueOf(d14));
                        if (r1 != null) {
                            d15 = r1.A07;
                        } else {
                            d15 = null;
                        }
                        0eP r7 = new 0eP("general_vm_scores_final", String.valueOf(d15));
                        if (r1 != null) {
                            d16 = r1.A03;
                        }
                        HashMap A022 = 0Yt.A02(new 0eP[]{r0, r02, r03, r04, r05, r06, r07, r08, r09, r010, r011, r012, r14, r13, r122, r112, r10, r9, r8, r7, new 0eP("crown_vm_scores_final", String.valueOf(d16))});
                        if (1Wj.A00 != null) {
                            C18798W2k.A03(new C15578Uf6(r5, this), userSession, A002, A022);
                        }
                    } else if (1Wj.A00 != null) {
                        C18798W2k.A02(new C15579Uf7(r5, this), userSession, A002);
                    }
                }
            }
        }
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }
}
