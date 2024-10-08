package X;

import android.app.TimePickerDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class E3D extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "QuietModeFragmentOld";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public IgTextView A0C;
    public IgTextView A0D;
    public IgTextView A0E;
    public IgTextView A0F;
    public IgTextView A0G;
    public IgTextView A0H;
    public IgTextView A0I;
    public IgTextView A0J;
    public IgTextView A0K;
    public IgdsSwitch A0L;
    public DcU A0M;
    public String A0N = "settings";
    public List A0O = 0sn.A00;
    public boolean A0P;
    public IgTextView A0Q;
    public boolean A0R;
    public final C51075Fo5 A0S = new C51075Fo5(this, 1);
    public final C51075Fo5 A0T = new C51075Fo5(this, 2);
    public final AnonymousClass0iw A0U = DbS.A0O("quiet_mode");
    public final Map A0V = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A0W = C227642jf.A02(this);
    public final 1wn A0X = new FXT(this, 2);
    public final 1wn A0Y = new FXT(this, 3);
    public final 1wn A0Z = new FXT(this, 4);
    public final 1wn A0a = new FXT(this, 5);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r0 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(X.E3D r6, boolean r7) {
        /*
            r2 = r6
            X.3FW r3 = X.Dba.A0R(r6)
            if (r7 != 0) goto L_0x0014
            X.0eM r0 = r6.A0W
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.C46359DdX.A08(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r6 = 0
        L_0x0015:
            X.0xx r0 = X.DbV.A0J(r2)
            r4 = 0
            r5 = 9
            X.MGK r1 = new X.MGK
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3D.A0G(X.E3D, boolean):void");
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        int i = 2131971223;
        if (this.A0P) {
            i = 2131973970;
        }
        DbW.A1C(r3, getString(i));
    }

    public final String getModuleName() {
        return "quiet_mode";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Resources A052;
        int i;
        String str;
        int i2;
        int i3;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        boolean z = this.A0P;
        int i4 = R.id.quiet_mode_switch_subtitle;
        if (z) {
            i4 = R.id.sleep_mode_switch_subtitle;
        }
        this.A0Q = DbT.A0a(view2, i4);
        boolean z2 = this.A0P;
        int i5 = R.id.quiet_mode_switch_row;
        if (z2) {
            i5 = R.id.sleep_mode_switch_row;
        }
        View A0F2 = AnonymousClass7TF.A0F(view2, i5);
        boolean z3 = this.A0P;
        int i6 = R.id.quiet_mode_switch_footer;
        if (z3) {
            i6 = R.id.sleep_mode_switch_footer;
        }
        TextView A0R2 = AnonymousClass7TG.A0R(view2, i6);
        AnonymousClass0eM r23 = this.A0W;
        UserSession A0l = AnonymousClass7TE.A0l(r23);
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, A0l, 36316001483624295L)) {
            boolean z4 = this.A0P;
            int i7 = R.id.quiet_mode_setup;
            if (z4) {
                i7 = R.id.sleep_mode_setup;
            }
            Dbb.A0t(view2, i7, 8);
        }
        A0R2.setVisibility(8);
        boolean z5 = false;
        A0R2.setVisibility(0);
        if (182.A06(r6, AnonymousClass7TE.A0l(r23), 2342168300710474575L)) {
            A052 = DbV.A05(this);
            i = 2131971195;
            if (this.A0P) {
                i = 2131973946;
            }
        } else {
            boolean A062 = 182.A06(r6, AnonymousClass7TE.A0l(r23), 36316001483624295L);
            A052 = DbV.A05(this);
            boolean z6 = this.A0P;
            if (A062) {
                i = 2131971197;
                if (z6) {
                    i = 2131973948;
                }
            } else {
                i = 2131971196;
                if (z6) {
                    i = 2131973947;
                }
            }
        }
        DbU.A1A(A052, A0R2, i);
        if (!C46359DdX.A08(AnonymousClass7TE.A0l(r23)) || !182.A06(r6, AnonymousClass7TE.A0l(r23), 36316001483296613L)) {
            IgTextView igTextView = this.A0Q;
            if (igTextView == null) {
                str = "quietModeSwitchSubtitleView";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            igTextView.setVisibility(8);
        } else {
            A0A(this);
        }
        User A0P2 = Dba.A0P(this);
        AnonymousClass3FW A0R3 = Dba.A0R(this);
        boolean z7 = this.A0P;
        int i8 = R.id.quiet_mode_switch_toggle;
        if (z7) {
            i8 = R.id.sleep_mode_switch_toggle;
        }
        IgdsSwitch igdsSwitch = (IgdsSwitch) view2.requireViewById(i8);
        if (A0P2.A1Z() || C46359DdX.A08(AnonymousClass7TE.A0l(r23))) {
            z5 = true;
        }
        igdsSwitch.setChecked(z5);
        igdsSwitch.setEnabled(true);
        igdsSwitch.A07 = new FdQ(igdsSwitch, A0P2, A0R3, this);
        C48947Eml.A00(A0F2, igdsSwitch);
        this.A0L = igdsSwitch;
        if (this.A0P) {
            this.A03 = view2.requireViewById(R.id.sleep_mode_turn_on_automatically);
            this.A0H = DbT.A0a(view2, R.id.sleep_mode_time_period);
            this.A00 = view2.requireViewById(R.id.sleep_mode_divider);
            this.A01 = view2.requireViewById(R.id.sleep_mode_start_interval_row);
            this.A02 = view2.requireViewById(R.id.sleep_mode_end_interval_row);
            i2 = R.id.sleep_mode_settings_footer;
        } else {
            this.A03 = view2.requireViewById(R.id.quiet_mode_turn_on_automatically);
            this.A0H = DbT.A0a(view2, R.id.quiet_mode_time_period);
            this.A00 = view2.requireViewById(R.id.quiet_mode_divider);
            this.A01 = view2.requireViewById(R.id.quiet_mode_start_interval_row);
            this.A02 = view2.requireViewById(R.id.quiet_mode_end_interval_row);
            i2 = R.id.quiet_mode_settings_footer;
        }
        this.A0G = DbT.A0a(view2, i2);
        View view3 = this.A01;
        if (view3 != null) {
            this.A06 = DbT.A0a(view3, R.id.title);
            View view4 = this.A01;
            if (view4 != null) {
                this.A05 = DbT.A0a(view4, R.id.daily_time_spent_quota);
                View view5 = this.A01;
                if (view5 != null) {
                    this.A04 = DbT.A0a(view5, R.id.subtitle);
                    View view6 = this.A02;
                    str = "quietModeToRowView";
                    if (view6 != null) {
                        this.A0K = DbT.A0a(view6, R.id.title);
                        View view7 = this.A02;
                        if (view7 != null) {
                            this.A0J = DbT.A0a(view7, R.id.daily_time_spent_quota);
                            View view8 = this.A02;
                            if (view8 != null) {
                                this.A0I = DbT.A0a(view8, R.id.subtitle);
                                View view9 = this.A01;
                                if (view9 != null) {
                                    Dbb.A0t(view9, R.id.chevron_right, 8);
                                    View view10 = this.A02;
                                    if (view10 != null) {
                                        Dbb.A0t(view10, R.id.chevron_right, 8);
                                        A04(A0P2);
                                        AnonymousClass3FW A0R4 = Dba.A0R(this);
                                        if (this.A0P) {
                                            this.A07 = DbT.A0a(view2, R.id.sleep_mode_day_customization_day0);
                                            this.A08 = DbT.A0a(view2, R.id.sleep_mode_day_customization_day1);
                                            this.A09 = DbT.A0a(view2, R.id.sleep_mode_day_customization_day2);
                                            this.A0A = DbT.A0a(view2, R.id.sleep_mode_day_customization_day3);
                                            this.A0B = DbT.A0a(view2, R.id.sleep_mode_day_customization_day4);
                                            this.A0C = DbT.A0a(view2, R.id.sleep_mode_day_customization_day5);
                                            this.A0D = DbT.A0a(view2, R.id.sleep_mode_day_customization_day6);
                                            this.A0F = DbT.A0a(view2, R.id.sleep_mode_day_customization_header);
                                            i3 = R.id.sleep_mode_day_customization_footer;
                                        } else {
                                            this.A07 = DbT.A0a(view2, R.id.quiet_mode_day_customization_day0);
                                            this.A08 = DbT.A0a(view2, R.id.quiet_mode_day_customization_day1);
                                            this.A09 = DbT.A0a(view2, R.id.quiet_mode_day_customization_day2);
                                            this.A0A = DbT.A0a(view2, R.id.quiet_mode_day_customization_day3);
                                            this.A0B = DbT.A0a(view2, R.id.quiet_mode_day_customization_day4);
                                            this.A0C = DbT.A0a(view2, R.id.quiet_mode_day_customization_day5);
                                            this.A0D = DbT.A0a(view2, R.id.quiet_mode_day_customization_day6);
                                            this.A0F = DbT.A0a(view2, R.id.quiet_mode_day_customization_header);
                                            i3 = R.id.quiet_mode_day_customization_footer;
                                        }
                                        this.A0E = DbT.A0a(view2, i3);
                                        if (182.A06(r6, AnonymousClass7TE.A0l(r23), 36322035911174041L)) {
                                            A02(0);
                                            List A042 = A0R4.A04();
                                            ArrayList A1C = AnonymousClass7TE.A1C();
                                            Iterator it = A042.iterator();
                                            while (it.hasNext()) {
                                                DcU A002 = DcT.A00(AnonymousClass7TE.A18(it));
                                                if (A002 != null) {
                                                    A1C.add(A002);
                                                }
                                            }
                                            this.A0O = 00k.A0U(A1C);
                                            Map map = this.A0V;
                                            DcU dcU = DcU.SUNDAY;
                                            IgTextView igTextView2 = this.A07;
                                            if (igTextView2 != null) {
                                                map.put(dcU, igTextView2);
                                                DcU dcU2 = DcU.MONDAY;
                                                IgTextView igTextView3 = this.A08;
                                                if (igTextView3 != null) {
                                                    map.put(dcU2, igTextView3);
                                                    DcU dcU3 = DcU.TUESDAY;
                                                    IgTextView igTextView4 = this.A09;
                                                    if (igTextView4 != null) {
                                                        map.put(dcU3, igTextView4);
                                                        DcU dcU4 = DcU.WEDNESDAY;
                                                        IgTextView igTextView5 = this.A0A;
                                                        if (igTextView5 != null) {
                                                            map.put(dcU4, igTextView5);
                                                            DcU dcU5 = DcU.THURSDAY;
                                                            IgTextView igTextView6 = this.A0B;
                                                            if (igTextView6 != null) {
                                                                map.put(dcU5, igTextView6);
                                                                DcU dcU6 = DcU.FRIDAY;
                                                                IgTextView igTextView7 = this.A0C;
                                                                if (igTextView7 != null) {
                                                                    map.put(dcU6, igTextView7);
                                                                    DcU dcU7 = DcU.SATURDAY;
                                                                    IgTextView igTextView8 = this.A0D;
                                                                    String str2 = "quietModeDay6View";
                                                                    if (igTextView8 != null) {
                                                                        map.put(dcU7, igTextView8);
                                                                        Iterator it2 = DcT.A02().iterator();
                                                                        while (it2.hasNext()) {
                                                                            DcU A003 = DcT.A00(AnonymousClass7TE.A18(it2));
                                                                            if (A003 != null) {
                                                                                if (this.A0O.contains(A003)) {
                                                                                    A07(A003);
                                                                                } else {
                                                                                    A06(A003);
                                                                                }
                                                                            }
                                                                        }
                                                                        IgTextView igTextView9 = this.A07;
                                                                        if (igTextView9 != null) {
                                                                            DbU.A1A(DbV.A05(this), igTextView9, 2131957444);
                                                                            IgTextView igTextView10 = this.A08;
                                                                            if (igTextView10 != null) {
                                                                                DbU.A1A(DbV.A05(this), igTextView10, 2131957440);
                                                                                IgTextView igTextView11 = this.A09;
                                                                                if (igTextView11 != null) {
                                                                                    DbU.A1A(DbV.A05(this), igTextView11, 2131957448);
                                                                                    IgTextView igTextView12 = this.A0A;
                                                                                    if (igTextView12 != null) {
                                                                                        DbU.A1A(DbV.A05(this), igTextView12, 2131957450);
                                                                                        IgTextView igTextView13 = this.A0B;
                                                                                        if (igTextView13 != null) {
                                                                                            DbU.A1A(DbV.A05(this), igTextView13, 2131957446);
                                                                                            IgTextView igTextView14 = this.A0C;
                                                                                            if (igTextView14 != null) {
                                                                                                DbU.A1A(DbV.A05(this), igTextView14, 2131957438);
                                                                                                IgTextView igTextView15 = this.A0D;
                                                                                                if (igTextView15 != null) {
                                                                                                    DbU.A1A(DbV.A05(this), igTextView15, 2131957442);
                                                                                                    IgTextView igTextView16 = this.A0F;
                                                                                                    if (igTextView16 == null) {
                                                                                                        str2 = "quietModeDowHeader";
                                                                                                    } else {
                                                                                                        DbU.A1A(DbV.A05(this), igTextView16, 2131957464);
                                                                                                        IgTextView igTextView17 = this.A07;
                                                                                                        if (igTextView17 != null) {
                                                                                                            A03(igTextView17, this, dcU);
                                                                                                            IgTextView igTextView18 = this.A08;
                                                                                                            if (igTextView18 != null) {
                                                                                                                A03(igTextView18, this, dcU2);
                                                                                                                IgTextView igTextView19 = this.A09;
                                                                                                                if (igTextView19 != null) {
                                                                                                                    A03(igTextView19, this, dcU3);
                                                                                                                    IgTextView igTextView20 = this.A0A;
                                                                                                                    if (igTextView20 != null) {
                                                                                                                        A03(igTextView20, this, dcU4);
                                                                                                                        IgTextView igTextView21 = this.A0B;
                                                                                                                        if (igTextView21 != null) {
                                                                                                                            A03(igTextView21, this, dcU5);
                                                                                                                            IgTextView igTextView22 = this.A0C;
                                                                                                                            if (igTextView22 != null) {
                                                                                                                                A03(igTextView22, this, dcU6);
                                                                                                                                IgTextView igTextView23 = this.A0D;
                                                                                                                                if (igTextView23 != null) {
                                                                                                                                    A03(igTextView23, this, dcU7);
                                                                                                                                    IgTextView igTextView24 = this.A07;
                                                                                                                                    if (igTextView24 != null) {
                                                                                                                                        2eS.A01(igTextView24);
                                                                                                                                        IgTextView igTextView25 = this.A08;
                                                                                                                                        if (igTextView25 != null) {
                                                                                                                                            2eS.A01(igTextView25);
                                                                                                                                            IgTextView igTextView26 = this.A09;
                                                                                                                                            if (igTextView26 != null) {
                                                                                                                                                2eS.A01(igTextView26);
                                                                                                                                                IgTextView igTextView27 = this.A0A;
                                                                                                                                                if (igTextView27 != null) {
                                                                                                                                                    2eS.A01(igTextView27);
                                                                                                                                                    IgTextView igTextView28 = this.A0B;
                                                                                                                                                    if (igTextView28 != null) {
                                                                                                                                                        2eS.A01(igTextView28);
                                                                                                                                                        IgTextView igTextView29 = this.A0C;
                                                                                                                                                        if (igTextView29 != null) {
                                                                                                                                                            2eS.A01(igTextView29);
                                                                                                                                                            IgTextView igTextView30 = this.A0D;
                                                                                                                                                            if (igTextView30 != null) {
                                                                                                                                                                2eS.A01(igTextView30);
                                                                                                                                                                A05(A0R4, false);
                                                                                                                                                                IgTextView igTextView31 = this.A07;
                                                                                                                                                                if (igTextView31 != null) {
                                                                                                                                                                    FP4.A01(igTextView31, 59, this);
                                                                                                                                                                    IgTextView igTextView32 = this.A08;
                                                                                                                                                                    if (igTextView32 != null) {
                                                                                                                                                                        FP4.A01(igTextView32, 60, this);
                                                                                                                                                                        IgTextView igTextView33 = this.A09;
                                                                                                                                                                        if (igTextView33 != null) {
                                                                                                                                                                            FP4.A01(igTextView33, 61, this);
                                                                                                                                                                            IgTextView igTextView34 = this.A0A;
                                                                                                                                                                            if (igTextView34 != null) {
                                                                                                                                                                                FP4.A01(igTextView34, 62, this);
                                                                                                                                                                                IgTextView igTextView35 = this.A0B;
                                                                                                                                                                                if (igTextView35 != null) {
                                                                                                                                                                                    FP4.A01(igTextView35, 63, this);
                                                                                                                                                                                    IgTextView igTextView36 = this.A0C;
                                                                                                                                                                                    if (igTextView36 != null) {
                                                                                                                                                                                        FP4.A01(igTextView36, 64, this);
                                                                                                                                                                                        IgTextView igTextView37 = this.A0D;
                                                                                                                                                                                        if (igTextView37 != null) {
                                                                                                                                                                                            FP4.A01(igTextView37, 65, this);
                                                                                                                                                                                            A0B(this, 1.0f);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    0qQ.A0F(str2);
                                                                    throw AnonymousClass00P.createAndThrow();
                                                                }
                                                                0qQ.A0F("quietModeDay5View");
                                                                throw AnonymousClass00P.createAndThrow();
                                                            }
                                                            0qQ.A0F("quietModeDay4View");
                                                            throw AnonymousClass00P.createAndThrow();
                                                        }
                                                        0qQ.A0F("quietModeDay3View");
                                                        throw AnonymousClass00P.createAndThrow();
                                                    }
                                                    0qQ.A0F("quietModeDay2View");
                                                    throw AnonymousClass00P.createAndThrow();
                                                }
                                                0qQ.A0F("quietModeDay1View");
                                                throw AnonymousClass00P.createAndThrow();
                                            }
                                            0qQ.A0F("quietModeDay0View");
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                        A02(8);
                                        this.A0V.clear();
                                        if (!A0P2.A1Z() || C46359DdX.A08(AnonymousClass7TE.A0l(r23))) {
                                            A0C(this, 0.5f);
                                            A0B(this, 0.5f);
                                        }
                                        DcM A012 = F8V.A01(this);
                                        F10 A0Q2 = Dbb.A0Q(A0R3, this);
                                        String str3 = this.A0N;
                                        0qQ.A0B(str3, 1);
                                        DcM.A03(A012, A0Q2, "ig_quiet_mode_settings_impression", str3);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        0qQ.A0F("quietModeFromRowView");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A02(int i) {
        String str;
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            str = "quietModeDay0View";
        } else {
            igTextView.setVisibility(i);
            IgTextView igTextView2 = this.A08;
            if (igTextView2 == null) {
                str = "quietModeDay1View";
            } else {
                igTextView2.setVisibility(i);
                IgTextView igTextView3 = this.A09;
                if (igTextView3 == null) {
                    str = "quietModeDay2View";
                } else {
                    igTextView3.setVisibility(i);
                    IgTextView igTextView4 = this.A0A;
                    if (igTextView4 == null) {
                        str = "quietModeDay3View";
                    } else {
                        igTextView4.setVisibility(i);
                        IgTextView igTextView5 = this.A0B;
                        if (igTextView5 == null) {
                            str = "quietModeDay4View";
                        } else {
                            igTextView5.setVisibility(i);
                            IgTextView igTextView6 = this.A0C;
                            if (igTextView6 == null) {
                                str = "quietModeDay5View";
                            } else {
                                igTextView6.setVisibility(i);
                                IgTextView igTextView7 = this.A0D;
                                if (igTextView7 == null) {
                                    str = "quietModeDay6View";
                                } else {
                                    igTextView7.setVisibility(i);
                                    IgTextView igTextView8 = this.A0F;
                                    if (igTextView8 == null) {
                                        str = "quietModeDowHeader";
                                    } else {
                                        igTextView8.setVisibility(i);
                                        IgTextView igTextView9 = this.A0E;
                                        if (igTextView9 == null) {
                                            str = "quietModeDowFooter";
                                        } else {
                                            igTextView9.setVisibility(i);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A05(AnonymousClass3FW r19, boolean z) {
        IgTextView igTextView;
        Resources A052;
        int i;
        Object[] objArr;
        IgTextView igTextView2;
        String string;
        Resources A053;
        int i2;
        String str = "quietModeDowFooter";
        if (!r19.A01.A1Z()) {
            igTextView2 = this.A0E;
            if (igTextView2 != null) {
                A053 = DbV.A05(this);
                i2 = 2131957456;
                if (this.A0P) {
                    i2 = 2131973929;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        List A0g = 00k.A0g(this.A0O, new C51562Fw8(8));
        if (A0g.size() == 7) {
            igTextView2 = this.A0E;
            if (igTextView2 != null) {
                A053 = DbV.A05(this);
                i2 = 2131957457;
                if (this.A0P) {
                    i2 = 2131973930;
                }
            }
        } else {
            if (A0g.size() == 6) {
                igTextView = this.A0E;
                if (igTextView != null) {
                    A052 = DbV.A05(this);
                    i = 2131957461;
                    if (this.A0P) {
                        i = 2131973934;
                    }
                    objArr = new Object[]{A01(this, A0g, 0), A01(this, A0g, 1), A01(this, A0g, 2), A01(this, A0g, 3), A01(this, A0g, 4), A01(this, A0g, 5)};
                }
            } else if (A0g.size() == 5) {
                igTextView = this.A0E;
                if (igTextView != null) {
                    A052 = DbV.A05(this);
                    int i3 = 2131957458;
                    if (this.A0P) {
                        i3 = 2131973931;
                    }
                    objArr = new Object[]{A01(this, A0g, 0), A01(this, A0g, 1), A01(this, A0g, 2), A01(this, A0g, 3), A01(this, A0g, 4)};
                }
            } else if (A0g.size() == 4) {
                igTextView = this.A0E;
                if (igTextView != null) {
                    A052 = DbV.A05(this);
                    int i4 = 2131957459;
                    if (this.A0P) {
                        i4 = 2131973932;
                    }
                    objArr = new Object[]{A01(this, A0g, 0), A01(this, A0g, 1), A01(this, A0g, 2), A01(this, A0g, 3)};
                }
            } else if (A0g.size() == 3) {
                igTextView = this.A0E;
                if (igTextView != null) {
                    A052 = DbV.A05(this);
                    int i5 = 2131957462;
                    if (this.A0P) {
                        i5 = 2131973935;
                    }
                    objArr = new Object[]{A01(this, A0g, 0), A01(this, A0g, 1), A01(this, A0g, 2)};
                }
            } else if (A0g.size() == 2) {
                igTextView = this.A0E;
                if (igTextView != null) {
                    A052 = DbV.A05(this);
                    int i6 = 2131957463;
                    if (this.A0P) {
                        i6 = 2131973936;
                    }
                    objArr = new Object[]{A01(this, A0g, 0), A01(this, A0g, 1)};
                }
            } else if (this.A0O.size() == 1) {
                igTextView = this.A0E;
                if (igTextView != null) {
                    A052 = DbV.A05(this);
                    int i7 = 2131957460;
                    if (this.A0P) {
                        i7 = 2131973933;
                    }
                    objArr = new Object[]{A01(this, A0g, 0)};
                }
            } else if (A0g.isEmpty() && z) {
                Dba.A0P(this).A1D(false);
                IgdsSwitch igdsSwitch = this.A0L;
                if (igdsSwitch == null) {
                    str = "quietModeToggle";
                } else {
                    igdsSwitch.setChecked(false);
                    A0G(this, false);
                    return;
                }
            } else {
                return;
            }
            string = A052.getString(i, objArr);
            igTextView2.setText(string);
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
        string = A053.getString(i2);
        igTextView2.setText(string);
    }

    private final void A06(DcU dcU) {
        Map map = this.A0V;
        TextView textView = (TextView) map.get(dcU);
        if (textView != null) {
            DbT.A17(requireContext(), textView, 2Yu.A07(getContext()));
        }
        View view = (View) map.get(dcU);
        if (view != null) {
            DbU.A11(requireContext(), view, R.drawable.dow_disabled_button_background);
        }
        View view2 = (View) map.get(dcU);
        if (view2 != null) {
            view2.setSelected(false);
        }
    }

    private final void A07(DcU dcU) {
        Map map = this.A0V;
        TextView textView = (TextView) map.get(dcU);
        if (textView != null) {
            DbT.A17(requireContext(), textView, 2Yu.A0H(getContext(), R.attr.igds_color_gradient_blue));
        }
        View view = (View) map.get(dcU);
        if (view != null) {
            DbU.A11(requireContext(), view, R.drawable.dow_blue_button_background);
        }
        View view2 = (View) map.get(dcU);
        if (view2 != null) {
            view2.setSelected(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:15:0x0070->B:17:0x0076, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.DcU r22, X.E3D r23, boolean r24) {
        /*
            r0 = r23
            X.3FW r1 = X.Dba.A0R(r0)
            com.instagram.user.model.User r2 = r1.A01
            boolean r2 = r2.A1Z()
            r6 = 1
            r5 = 10
            if (r2 == 0) goto L_0x014b
            X.0eM r4 = r0.A0W
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            boolean r2 = X.C46359DdX.A08(r2)
            if (r2 != 0) goto L_0x014b
            boolean r2 = r0.A0R
            if (r2 != 0) goto L_0x014b
            java.util.List r2 = r0.A0O
            r8 = r22
            boolean r2 = r2.contains(r8)
            r13 = 0
            if (r2 == 0) goto L_0x009a
            if (r24 == 0) goto L_0x0082
            java.util.List r2 = r0.A0O
            int r2 = r2.size()
            if (r2 != r6) goto L_0x0082
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r7 = X.0Tu.A05
            r2 = 36316001483296613(0x81053600130f65, double:3.0297237986127346E-306)
            boolean r2 = X.182.A06(r7, r9, r2)
            if (r2 == 0) goto L_0x0082
            r0.A0M = r8
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r4)
            androidx.fragment.app.FragmentActivity r7 = r0.requireActivity()
            android.content.Context r3 = r0.requireContext()
            java.lang.String r2 = r0.A0N
            X.C46359DdX.A05(r3, r7, r9, r2)
        L_0x005a:
            X.DcM r11 = X.F8V.A01(r0)
            X.F10 r12 = X.Dbb.A0Q(r1, r0)
            java.lang.String r3 = r0.A0N
            java.lang.String r9 = r8.A02
            java.util.List r2 = r0.A0O
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r8 = r2.iterator()
        L_0x0070:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00f5
            java.lang.Object r2 = r8.next()
            X.DcU r2 = (X.DcU) r2
            java.lang.String r2 = r2.A02
            r7.add(r2)
            goto L_0x0070
        L_0x0082:
            java.util.List r2 = r0.A0O
            java.util.ArrayList r2 = X.00k.A0U(r2)
            r2.remove(r8)
            java.util.List r2 = X.00k.A0a(r2)
            r0.A0O = r2
            r0.A06(r8)
            r0.A0M = r13
            r0.A05(r1, r6)
            goto L_0x005a
        L_0x009a:
            java.util.List r2 = r0.A0O
            java.util.ArrayList r10 = X.00k.A0U(r2)
            r10.add(r8)
            java.util.List r2 = X.00k.A0a(r10)
            r0.A0O = r2
            r0.A07(r8)
            r2 = 0
            r0.A05(r1, r2)
            X.DcM r11 = X.F8V.A01(r0)
            X.F10 r12 = X.Dbb.A0Q(r1, r0)
            java.lang.String r7 = r0.A0N
            java.lang.String r9 = r8.A02
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r8 = r10.iterator()
        L_0x00c4:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00d6
            java.lang.Object r2 = r8.next()
            X.DcU r2 = (X.DcU) r2
            java.lang.String r2 = r2.A02
            r3.add(r2)
            goto L_0x00c4
        L_0x00d6:
            X.AnonymousClass7TF.A1B(r7, r6, r9)
            java.lang.String r2 = "day"
            java.util.Map r24 = X.AnonymousClass7TF.A0w(r2, r9)
            java.lang.String r21 = "ig_quiet_mode_custom_days_of_week_selected"
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r22 = r7
            r23 = r3
            X.DcM.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0113
        L_0x00f5:
            X.AnonymousClass7TF.A1B(r3, r6, r9)
            java.lang.String r2 = "day"
            java.util.Map r24 = X.AnonymousClass7TF.A0w(r2, r9)
            java.lang.String r21 = "ig_quiet_mode_custom_days_of_week_deselected"
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r22 = r3
            r23 = r7
            X.DcM.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0113:
            X.0xx r3 = X.DbV.A0J(r0)
            X.MGC r2 = new X.MGC
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (X.AnonymousClass4D7) r13, (int) r5)
            X.AnonymousClass7TE.A1Z(r2, r3)
            com.instagram.user.model.User r3 = X.Dba.A0P(r0)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            long r5 = r1.A01()
            long r7 = r1.A00()
            java.util.List r0 = r0.A0O
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0139:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r0 = r1.next()
            X.DcU r0 = (X.DcU) r0
            java.lang.String r0 = r0.A02
            r4.add(r0)
            goto L_0x0139
        L_0x014b:
            if (r24 != 0) goto L_0x01ae
            java.util.List r2 = r0.A0O
            int r2 = r2.size()
            if (r2 != r6) goto L_0x01ae
            X.0sn r2 = X.0sn.A00
            java.util.ArrayList r4 = X.00k.A0U(r2)
            java.util.List r2 = X.DcT.A02()
            java.util.Iterator r3 = r2.iterator()
        L_0x0163:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0177
            java.lang.String r2 = X.AnonymousClass7TE.A18(r3)
            X.DcU r2 = X.DcT.A00(r2)
            if (r2 == 0) goto L_0x0163
            r4.add(r2)
            goto L_0x0163
        L_0x0177:
            java.util.List r2 = X.00k.A0a(r4)
            r0.A0O = r2
            com.instagram.user.model.User r3 = X.Dba.A0P(r0)
            X.0eM r2 = r0.A0W
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            long r5 = r1.A01()
            long r7 = r1.A00()
            java.util.List r0 = r0.A0O
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0199:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r0 = r1.next()
            X.DcU r0 = (X.DcU) r0
            java.lang.String r0 = r0.A02
            r4.add(r0)
            goto L_0x0199
        L_0x01ab:
            X.C46359DdX.A07(r2, r3, r4, r5, r7)
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3D.A08(X.DcU, X.E3D, boolean):void");
    }

    public static final void A09(C59557JOd jOd, E3D e3d, long j) {
        long j2 = j / 3600;
        AnonymousClass0fN.A00(new TimePickerDialog(e3d.requireContext(), R.style.SpinnerTimePickerDialog, new I85(jOd, 1), (int) j2, (int) ((j - (3600 * j2)) / 60), DateFormat.is24HourFormat(e3d.requireContext())));
    }

    public static final void A0B(E3D e3d, float f) {
        if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(e3d.A0W), 36322035911174041L)) {
            IgTextView igTextView = e3d.A07;
            if (igTextView != null) {
                igTextView.setAlpha(f);
                IgTextView igTextView2 = e3d.A08;
                if (igTextView2 != null) {
                    igTextView2.setAlpha(f);
                    IgTextView igTextView3 = e3d.A09;
                    if (igTextView3 != null) {
                        igTextView3.setAlpha(f);
                        IgTextView igTextView4 = e3d.A0A;
                        if (igTextView4 != null) {
                            igTextView4.setAlpha(f);
                            IgTextView igTextView5 = e3d.A0B;
                            if (igTextView5 != null) {
                                igTextView5.setAlpha(f);
                                IgTextView igTextView6 = e3d.A0C;
                                if (igTextView6 != null) {
                                    igTextView6.setAlpha(f);
                                    IgTextView igTextView7 = e3d.A0D;
                                    String str = "quietModeDay6View";
                                    if (igTextView7 != null) {
                                        igTextView7.setAlpha(f);
                                        IgTextView igTextView8 = e3d.A0F;
                                        if (igTextView8 == null) {
                                            str = "quietModeDowHeader";
                                        } else {
                                            igTextView8.setAlpha(f);
                                            IgTextView igTextView9 = e3d.A0E;
                                            if (igTextView9 == null) {
                                                str = "quietModeDowFooter";
                                            } else {
                                                igTextView9.setAlpha(f);
                                                e3d.A0R = !AnonymousClass7TF.A1Q((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)));
                                                boolean A1Z = Dba.A0R(e3d).A01.A1Z();
                                                IgTextView igTextView10 = e3d.A07;
                                                if (igTextView10 != null) {
                                                    igTextView10.setClickable(A1Z);
                                                    IgTextView igTextView11 = e3d.A08;
                                                    if (igTextView11 != null) {
                                                        igTextView11.setClickable(A1Z);
                                                        IgTextView igTextView12 = e3d.A09;
                                                        if (igTextView12 != null) {
                                                            igTextView12.setClickable(A1Z);
                                                            IgTextView igTextView13 = e3d.A0A;
                                                            if (igTextView13 != null) {
                                                                igTextView13.setClickable(A1Z);
                                                                IgTextView igTextView14 = e3d.A0B;
                                                                if (igTextView14 != null) {
                                                                    igTextView14.setClickable(A1Z);
                                                                    IgTextView igTextView15 = e3d.A0C;
                                                                    if (igTextView15 != null) {
                                                                        igTextView15.setClickable(A1Z);
                                                                        IgTextView igTextView16 = e3d.A0D;
                                                                        if (igTextView16 != null) {
                                                                            igTextView16.setClickable(A1Z);
                                                                            if (!A1Z) {
                                                                                Iterator it = DcT.A02().iterator();
                                                                                while (it.hasNext()) {
                                                                                    DcU A002 = DcT.A00(AnonymousClass7TE.A18(it));
                                                                                    if (A002 != null) {
                                                                                        e3d.A06(A002);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (!e3d.A0R) {
                                                                                Iterator it2 = DcT.A02().iterator();
                                                                                while (it2.hasNext()) {
                                                                                    DcU A003 = DcT.A00(AnonymousClass7TE.A18(it2));
                                                                                    if (A003 != null) {
                                                                                        if (e3d.A0O.contains(A003)) {
                                                                                            e3d.A07(A003);
                                                                                        } else {
                                                                                            e3d.A06(A003);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    0qQ.A0F(str);
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                0qQ.A0F("quietModeDay5View");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            0qQ.A0F("quietModeDay4View");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("quietModeDay3View");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("quietModeDay2View");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("quietModeDay1View");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("quietModeDay0View");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A0C(E3D e3d, float f) {
        IgTextView igTextView = e3d.A0G;
        String str = "quietModeFooter";
        if (igTextView != null) {
            igTextView.setAlpha(f);
            View view = e3d.A03;
            if (view == null) {
                str = "quietModeTurnOnAutomaticallyRow";
            } else {
                view.setAlpha(f);
                View view2 = e3d.A00;
                if (view2 == null) {
                    str = "quietModeDivider";
                } else {
                    view2.setAlpha(f);
                    IgTextView igTextView2 = e3d.A0G;
                    if (igTextView2 != null) {
                        igTextView2.setAlpha(f);
                        View view3 = e3d.A01;
                        if (view3 == null) {
                            str = "quietModeFromRowView";
                        } else {
                            view3.setAlpha(f);
                            IgTextView igTextView3 = e3d.A05;
                            if (igTextView3 == null) {
                                str = "fromRowValue";
                            } else {
                                igTextView3.setAlpha(f);
                                IgTextView igTextView4 = e3d.A04;
                                if (igTextView4 == null) {
                                    str = "fromRowSubtitle";
                                } else {
                                    igTextView4.setAlpha(f);
                                    View view4 = e3d.A02;
                                    if (view4 == null) {
                                        str = "quietModeToRowView";
                                    } else {
                                        view4.setAlpha(f);
                                        IgTextView igTextView5 = e3d.A0J;
                                        if (igTextView5 == null) {
                                            str = "toRowValue";
                                        } else {
                                            igTextView5.setAlpha(f);
                                            IgTextView igTextView6 = e3d.A0I;
                                            if (igTextView6 == null) {
                                                str = "toRowSubtitle";
                                            } else {
                                                igTextView6.setAlpha(f);
                                                IgTextView igTextView7 = e3d.A0H;
                                                if (igTextView7 == null) {
                                                    str = "quietModeTimePeriodView";
                                                } else {
                                                    igTextView7.setAlpha(f);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v0, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011a, code lost:
        if (r31 != false) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0D(X.E3D r25, long r26, long r28, boolean r30, boolean r31) {
        /*
            r10 = r25
            r2 = r26
            r0 = r28
            X.3FW r14 = X.Dba.A0R(r10)
            X.0rl r11 = new X.0rl
            r11.<init>()
            r11.A00 = r2
            X.0rl r13 = new X.0rl
            r13.<init>()
            r13.A00 = r0
            long r4 = r11.A00
            int r8 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            long r6 = r28 - r4
            if (r8 <= 0) goto L_0x0024
            r4 = 86400(0x15180, double:4.26873E-319)
            long r6 = r6 + r4
        L_0x0024:
            X.0eM r4 = r10.A0W
            r29 = r4
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r29)
            X.0Tu r12 = X.0Tu.A05
            r8 = 36597476459547466(0x820536000c0b4a, double:3.2077297070025294E-306)
            long r15 = X.182.A01(r12, r4, r8)
            int r4 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x007b
            X.DcM r17 = X.F8V.A01(r10)
            X.F10 r18 = X.Dbb.A0Q(r14, r10)
            long r4 = r11.A00
            r27 = r4
            long r15 = r13.A00
            java.lang.String r4 = r10.A0N
            java.lang.String r20 = "customization_error"
            java.lang.String r21 = "Interval is too long"
            r26 = 1
            r24 = r15
            r19 = r4
            r22 = r27
            r17.A05(r18, r19, r20, r21, r22, r24, r26)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r29)
            long r8 = X.182.A01(r12, r4, r8)
            long r4 = r6 - r8
            if (r31 == 0) goto L_0x016c
            long r8 = r0 - r4
            r17 = 86400(0x15180, double:4.26873E-319)
            r15 = 0
            int r4 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x0073
            long r8 = r8 + r17
        L_0x0073:
            int r4 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r4 < 0) goto L_0x0079
            long r8 = r8 - r17
        L_0x0079:
            r13.A00 = r8
        L_0x007b:
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r29)
            r8 = 36597476459678539(0x820536000e0b4b, double:3.2077297070854205E-306)
            long r15 = X.182.A01(r12, r4, r8)
            int r4 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x011a
            X.DcM r17 = X.F8V.A01(r10)
            X.F10 r18 = X.Dbb.A0Q(r14, r10)
            long r4 = r11.A00
            r27 = r4
            long r15 = r13.A00
            java.lang.String r4 = r10.A0N
            java.lang.String r20 = "customization_error"
            java.lang.String r21 = "Interval is too short"
            r26 = 1
            r24 = r15
            r19 = r4
            r22 = r27
            r17.A05(r18, r19, r20, r21, r22, r24, r26)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r29)
            long r4 = X.182.A01(r12, r4, r8)
            long r6 = r6 - r4
            if (r31 == 0) goto L_0x011d
            long r0 = r0 - r6
            r5 = 86400(0x15180, double:4.26873E-319)
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c1
            long r0 = r0 + r5
        L_0x00c1:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x00c6
            long r0 = r0 - r5
        L_0x00c6:
            r13.A00 = r0
        L_0x00c8:
            X.DcM r15 = X.F8V.A01(r10)
            X.F10 r16 = X.Dbb.A0Q(r14, r10)
            java.lang.String r2 = r10.A0N
            long r0 = r11.A00
            long r4 = r14.A01()
            boolean r3 = X.DbW.A1Y(r2)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r3)
            java.lang.Long r20 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "previous_start_time"
            java.util.Map r28 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r25 = "ig_quiet_mode_start_time_customized"
            r19 = 0
            r18 = r17
            r21 = r19
            r22 = r19
            r23 = r19
            r24 = r19
            r26 = r2
            r27 = r19
            X.DcM.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0103:
            X.0xx r1 = X.DbV.A0J(r10)
            r8 = 6
            X.JTY r0 = new X.JTY
            r2 = r0
            r3 = r14
            r4 = r11
            r5 = r10
            r6 = r13
            r7 = r19
            r9 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r0, r1)
            return
        L_0x011a:
            if (r31 == 0) goto L_0x0130
            goto L_0x00c8
        L_0x011d:
            long r0 = -r6
            long r2 = r2 - r0
            r6 = 86400(0x15180, double:4.26873E-319)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0129
            long r2 = r2 + r6
        L_0x0129:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x012e
            long r2 = r2 - r6
        L_0x012e:
            r11.A00 = r2
        L_0x0130:
            X.DcM r15 = X.F8V.A01(r10)
            X.F10 r16 = X.Dbb.A0Q(r14, r10)
            java.lang.String r2 = r10.A0N
            long r0 = r13.A00
            long r4 = r14.A00()
            boolean r3 = X.DbW.A1Y(r2)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r3)
            java.lang.Long r21 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "previous_end_time"
            java.util.Map r28 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r25 = "ig_quiet_mode_end_time_customized"
            r19 = 0
            r18 = r17
            r20 = r19
            r22 = r19
            r23 = r19
            r24 = r19
            r26 = r2
            r27 = r19
            X.DcM.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0103
        L_0x016c:
            long r8 = -r4
            long r4 = r2 - r8
            r17 = 86400(0x15180, double:4.26873E-319)
            r15 = 0
            int r8 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x017a
            long r4 = r4 + r17
        L_0x017a:
            int r8 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r8 < 0) goto L_0x0180
            long r4 = r4 - r17
        L_0x0180:
            r11.A00 = r4
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3D.A0D(X.E3D, long, long, boolean, boolean):void");
    }

    public static final void A0E(E3D e3d, boolean z) {
        AnonymousClass0eM r4 = e3d.A0W;
        if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(r4), 36316001483231076L)) {
            AnonymousClass3FW A0R2 = Dba.A0R(e3d);
            if (z) {
                UserSession A0l = AnonymousClass7TE.A0l(r4);
                0qQ.A0B(A0l, 0);
                ((2SG) A0l.A01(2SG.class, new C58175Inf(A0l, 24))).A00(AnonymousClass7TE.A0l(r4), A0R2);
            }
        }
    }

    public static final void A0F(E3D e3d, boolean z) {
        float f;
        String str;
        IgdsSwitch igdsSwitch = e3d.A0L;
        if (igdsSwitch == null) {
            str = "quietModeToggle";
        } else {
            igdsSwitch.setChecked(z);
            User A0P2 = Dba.A0P(e3d);
            if (z) {
                e3d.A04(A0P2);
                f = 1.0f;
            } else {
                f = 0.5f;
                A0C(e3d, 0.5f);
            }
            A0B(e3d, f);
            AnonymousClass0eM r5 = e3d.A0W;
            if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(r5), 36322035911174041L)) {
                e3d.A05(Dba.A0R(e3d), false);
            }
            if (!z) {
                IgTextView igTextView = e3d.A0Q;
                if (igTextView == null) {
                    str = "quietModeSwitchSubtitleView";
                } else {
                    igTextView.setVisibility(8);
                }
            } else {
                2B1 r4 = 2B0.A01;
                UserSession A0l = AnonymousClass7TE.A0l(r5);
                0qQ.A0B(A0l, 0);
                0xY A0c = DbV.A0c(A0l, r4);
                A0c.E5c("QUIET_MODE_NEXT_TOAST_TIME", 0);
                A0c.apply();
            }
            C46359DdX.A06(AnonymousClass7TE.A0l(r5));
            Dba.A1J(AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r5)), z);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final UserSession A0H() {
        return AnonymousClass7TE.A0l(this.A0W);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0W);
    }

    public static final int A00(DcU dcU) {
        switch (dcU.ordinal()) {
            case 0:
                return 2131957443;
            case 1:
                return 2131957439;
            case 2:
                return 2131957447;
            case 3:
                return 2131957449;
            case 4:
                return 2131957445;
            case 5:
                return 2131957437;
            case 6:
                return 2131957441;
            default:
                throw AnonymousClass7TE.A1K();
        }
    }

    public static String A01(Fragment fragment, List list, int i) {
        return fragment.requireContext().getResources().getString(A00((DcU) list.get(i)));
    }

    public static void A03(View view, Fragment fragment, DcU dcU) {
        view.setContentDescription(fragment.requireContext().getResources().getString(A00(dcU)));
    }

    private final void A04(User user) {
        Resources A052;
        int i;
        Resources A053;
        int i2;
        AnonymousClass3FW A0R2 = Dba.A0R(this);
        AnonymousClass0eM r11 = this.A0W;
        UserSession A0l = AnonymousClass7TE.A0l(r11);
        0Tu r10 = 0Tu.A05;
        long A012 = 182.A01(r10, A0l, 36597476459547466L) / 3600;
        View view = this.A00;
        String str = "quietModeDivider";
        if (view != null) {
            view.setVisibility(8);
            if (!182.A06(r10, AnonymousClass7TE.A0l(r11), 36316001483624295L)) {
                View view2 = this.A03;
                if (view2 == null) {
                    str = "quietModeTurnOnAutomaticallyRow";
                } else {
                    view2.setVisibility(0);
                    View view3 = this.A00;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                }
            }
            IgTextView igTextView = this.A0G;
            str = "quietModeFooter";
            if (igTextView != null) {
                int i3 = 2131971222;
                if (this.A0P) {
                    i3 = 2131973969;
                }
                DbX.A1F(igTextView, this, String.valueOf(A012), i3);
                IgTextView igTextView2 = this.A0G;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                    long A082 = DbZ.A08(Calendar.getInstance()) / 1000;
                    long A013 = A0R2.A01() + A082;
                    long A002 = A082 + A0R2.A00();
                    View view4 = this.A01;
                    if (view4 == null) {
                        str = "quietModeFromRowView";
                    } else {
                        view4.setVisibility(0);
                        boolean A062 = 182.A06(r10, AnonymousClass7TE.A0l(r11), 36316001483624295L);
                        String str2 = "fromRowViewTile";
                        IgTextView igTextView3 = this.A06;
                        if (A062) {
                            if (igTextView3 != null) {
                                A052 = DbV.A05(this);
                                i = 2131971227;
                                if (this.A0P) {
                                    i = 2131973974;
                                }
                            }
                            0qQ.A0F(str2);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        if (igTextView3 != null) {
                            A052 = DbV.A05(this);
                            i = 2131971226;
                            if (this.A0P) {
                                i = 2131973973;
                            }
                        }
                        0qQ.A0F(str2);
                        throw AnonymousClass00P.createAndThrow();
                        DbU.A1A(A052, igTextView3, i);
                        IgTextView igTextView4 = this.A05;
                        str2 = "fromRowValue";
                        if (igTextView4 != null) {
                            igTextView4.setVisibility(0);
                            IgTextView igTextView5 = this.A05;
                            if (igTextView5 != null) {
                                igTextView5.setText(FGR.A01(requireContext(), A013));
                                IgTextView igTextView6 = this.A04;
                                if (igTextView6 == null) {
                                    str = "fromRowSubtitle";
                                } else {
                                    igTextView6.setVisibility(8);
                                    View view5 = this.A02;
                                    if (view5 == null) {
                                        str = "quietModeToRowView";
                                    } else {
                                        view5.setVisibility(0);
                                        boolean A063 = 182.A06(r10, AnonymousClass7TE.A0l(r11), 36316001483624295L);
                                        String str3 = "toRowViewTile";
                                        IgTextView igTextView7 = this.A0K;
                                        if (A063) {
                                            if (igTextView7 != null) {
                                                A053 = DbV.A05(this);
                                                i2 = 2131971225;
                                                if (this.A0P) {
                                                    i2 = 2131973972;
                                                }
                                            }
                                            0qQ.A0F(str3);
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                        if (igTextView7 != null) {
                                            A053 = DbV.A05(this);
                                            i2 = 2131971228;
                                            if (this.A0P) {
                                                i2 = 2131973975;
                                            }
                                        }
                                        0qQ.A0F(str3);
                                        throw AnonymousClass00P.createAndThrow();
                                        DbU.A1A(A053, igTextView7, i2);
                                        IgTextView igTextView8 = this.A0J;
                                        str3 = "toRowValue";
                                        if (igTextView8 != null) {
                                            igTextView8.setVisibility(0);
                                            IgTextView igTextView9 = this.A0J;
                                            if (igTextView9 != null) {
                                                igTextView9.setText(FGR.A01(requireContext(), A002));
                                                IgTextView igTextView10 = this.A0I;
                                                if (igTextView10 == null) {
                                                    str = "toRowSubtitle";
                                                } else {
                                                    igTextView10.setVisibility(8);
                                                    IgTextView igTextView11 = this.A05;
                                                    if (igTextView11 != null) {
                                                        User user2 = user;
                                                        AnonymousClass0fU.A00(new C50102FOs(6, (Object) user2, (Object) this, (Object) A0R2), igTextView11);
                                                        IgTextView igTextView12 = this.A0J;
                                                        if (igTextView12 != null) {
                                                            AnonymousClass0fU.A00(new C50102FOs(7, (Object) user2, (Object) this, (Object) A0R2), igTextView12);
                                                            A0C(this, 1.0f);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        0qQ.A0F(str3);
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                }
                            }
                        }
                        0qQ.A0F(str2);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0A(E3D e3d) {
        long A0I2 = AnonymousClass7TG.A0I();
        AnonymousClass0eM r5 = e3d.A0W;
        long A032 = C46359DdX.A03(AnonymousClass7TE.A0l(r5), A0I2);
        Date A042 = C46359DdX.A04(AnonymousClass7TE.A0l(r5), A0I2);
        IgTextView igTextView = e3d.A0Q;
        if (igTextView != null) {
            Resources A052 = DbV.A05(e3d);
            int i = 2131971214;
            if (e3d.A0P) {
                i = 2131973962;
            }
            DbY.A0y(A052, igTextView, FGR.A04(e3d.requireContext(), A032).format(A042), i);
            IgTextView igTextView2 = e3d.A0Q;
            if (igTextView2 != null) {
                igTextView2.setVisibility(0);
                return;
            }
        }
        0qQ.A0F("quietModeSwitchSubtitleView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-923336799);
        E3D.super.onCreate(bundle);
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0W));
        A002.A01(this.A0X, FWI.class);
        A002.A01(this.A0Z, FWK.class);
        A002.A01(this.A0a, FWL.class);
        A002.A01(this.A0Y, FWJ.class);
        AnonymousClass0fD.A09(816665183, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1109418027);
        0qQ.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("entrypoint")) == null) {
            str = "settings";
        }
        this.A0N = str;
        boolean A012 = 2Au.A01(AnonymousClass7TE.A0l(this.A0W));
        this.A0P = A012;
        int i = R.layout.quiet_mode_settings;
        if (A012) {
            i = R.layout.sleep_mode_settings;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        AnonymousClass0fD.A09(-504660363, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1327539731);
        super.onDestroy();
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0W));
        A002.A02(this.A0X, FWI.class);
        A002.A02(this.A0Z, FWK.class);
        A002.A02(this.A0a, FWL.class);
        A002.A02(this.A0Y, FWJ.class);
        AnonymousClass0fD.A09(470917297, A022);
    }
}
