package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.datepicker.IgDatePicker;
import com.instagram.igds.components.datepicker.IgTimePicker;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.UbI  reason: case insensitive filesystem */
public final class C15365UbI extends AnonymousClass4DH implements C268594df {
    public static final String __redex_internal_original_name = "DatePickerSheetFragment";
    public int A00;
    public int A01;
    public int A02 = 5;
    public C74441Puw A03;
    public IgDatePicker A04;
    public IgTimePicker A05;
    public String A06;
    public Calendar A07;
    public Date A08;
    public Date A09;
    public Date A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public UserSession A0E;
    public boolean A0F;

    public final int AqL() {
        return -2;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return false;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0197  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            r21 = this;
            r5 = 0
            r4 = r22
            X.0qQ.A0B(r4, r5)
            r6 = r21
            r0 = r23
            super.onViewCreated(r4, r0)
            r0 = 2131431327(0x7f0b0f9f, float:1.848438E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r4, r0)
            java.lang.String r0 = r6.A06
            if (r0 == 0) goto L_0x00ec
            r1.setText(r0)
            r0 = 0
        L_0x001c:
            r1.setVisibility(r0)
            r0 = 2131431326(0x7f0b0f9e, float:1.8484378E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r4, r0)
            android.content.Context r8 = r6.getThemedContext()
            int r0 = r6.A01
            float r3 = (float) r0
            int r2 = r6.A00
            r19 = 80
            X.8jL r1 = new X.8jL
            r0 = r19
            r1.<init>(r8, r3, r2, r0)
            r7.setBackground(r1)
            r0 = 2131431329(0x7f0b0fa1, float:1.8484384E38)
            android.view.View r0 = r7.requireViewById(r0)
            com.instagram.igds.components.datepicker.IgDatePicker r0 = (com.instagram.igds.components.datepicker.IgDatePicker) r0
            r6.A04 = r0
            java.util.Calendar r1 = r6.A07
            java.lang.String r18 = "datePickerCalendar"
            if (r1 == 0) goto L_0x00f0
            r2 = 2
            int r0 = r1.getActualMinimum(r2)
            r1.set(r2, r0)
            java.util.Calendar r1 = r6.A07
            if (r1 == 0) goto L_0x00f0
            r8 = 5
            int r0 = r1.getActualMinimum(r8)
            r1.set(r8, r0)
            com.instagram.igds.components.datepicker.IgDatePicker r1 = r6.A04
            java.lang.String r9 = "datePicker"
            r20 = r9
            if (r1 == 0) goto L_0x01ce
            java.util.Calendar r0 = r6.A07
            if (r0 == 0) goto L_0x00f0
            r1.setMinDate(r0)
            java.util.Calendar r1 = r6.A07
            if (r1 == 0) goto L_0x00f0
            int r0 = r1.getActualMaximum(r2)
            r1.set(r2, r0)
            java.util.Calendar r1 = r6.A07
            if (r1 == 0) goto L_0x00f0
            int r0 = r1.getActualMaximum(r8)
            r1.set(r8, r0)
            com.instagram.igds.components.datepicker.IgDatePicker r1 = r6.A04
            if (r1 == 0) goto L_0x01ce
            java.util.Calendar r0 = r6.A07
            if (r0 == 0) goto L_0x00f0
            r1.setMaxDate(r0)
            java.util.Date r1 = r6.A09
            if (r1 == 0) goto L_0x00df
            java.util.Calendar r0 = r6.A07
            if (r0 == 0) goto L_0x00f0
            r0.setTime(r1)
        L_0x009b:
            com.instagram.igds.components.datepicker.IgDatePicker r10 = r6.A04
            if (r10 == 0) goto L_0x01ce
            java.util.Calendar r12 = r6.A07
            if (r12 == 0) goto L_0x00f0
            X.VMw r9 = new X.VMw
            r9.<init>(r6)
            android.widget.NumberPicker r0 = r10.A01
            java.lang.String r17 = "monthPicker"
            if (r0 == 0) goto L_0x0211
            int r15 = r0.getMinValue()
            android.widget.NumberPicker r0 = r10.A01
            if (r0 == 0) goto L_0x0211
            int r14 = r0.getMaxValue()
            int r0 = r14 - r15
            r3 = 1
            int r0 = r0 + 1
            java.lang.String[] r13 = new java.lang.String[r0]
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            r11.set(r2, r15)
            if (r15 > r14) goto L_0x00f5
            r1 = r15
        L_0x00cb:
            int r16 = r1 - r15
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r11.getDisplayName(r2, r3, r0)
            r13[r16] = r0
            r11.add(r2, r3)
            if (r1 == r14) goto L_0x00f5
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00df:
            java.util.Calendar r1 = r6.A07
            if (r1 == 0) goto L_0x00f0
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r1.setTime(r0)
            goto L_0x009b
        L_0x00ec:
            r0 = 8
            goto L_0x001c
        L_0x00f0:
            X.0qQ.A0F(r18)
            goto L_0x01d1
        L_0x00f5:
            android.widget.NumberPicker r0 = r10.A01
            if (r0 == 0) goto L_0x0211
            r0.setDisplayedValues(r13)
            java.lang.String r11 = "dayPicker"
            int r0 = r12.get(r2)
            com.instagram.igds.components.datepicker.IgDatePicker.A01(r10, r0)
            android.widget.NumberPicker r1 = r10.A01
            if (r1 == 0) goto L_0x0211
            int r0 = r12.get(r2)
            r1.setValue(r0)
            android.widget.NumberPicker r1 = r10.A00
            if (r1 == 0) goto L_0x020d
            int r0 = r12.get(r8)
            r1.setValue(r0)
            android.widget.NumberPicker r1 = r10.A01
            if (r1 == 0) goto L_0x0211
            X.WD5 r0 = new X.WD5
            r0.<init>((X.C17218VMw) r9, (com.instagram.igds.components.datepicker.IgDatePicker) r10, (int) r5)
            r1.setOnValueChangedListener(r0)
            android.widget.NumberPicker r1 = r10.A00
            if (r1 == 0) goto L_0x020d
            X.WD5 r0 = new X.WD5
            r0.<init>((X.C17218VMw) r9, (com.instagram.igds.components.datepicker.IgDatePicker) r10, (int) r3)
            r1.setOnValueChangedListener(r0)
            r0 = 2131442825(0x7f0b3c89, float:1.85077E38)
            android.view.View r10 = r7.requireViewById(r0)
            com.instagram.igds.components.datepicker.IgTimePicker r10 = (com.instagram.igds.components.datepicker.IgTimePicker) r10
            r6.A05 = r10
            java.lang.String r14 = "timePicker"
            if (r10 == 0) goto L_0x0209
            java.util.Calendar r0 = r6.A07
            if (r0 == 0) goto L_0x00f0
            int r9 = r0.get(r2)
            java.util.Calendar r0 = r6.A07
            if (r0 == 0) goto L_0x00f0
            int r7 = r0.get(r8)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r0 = r0.get(r3)
            r1.set(r0, r9, r7)
            r10.A01 = r1
            com.instagram.igds.components.datepicker.IgTimePicker r11 = r6.A05
            if (r11 == 0) goto L_0x0209
            java.util.Date r0 = r6.A08
            java.util.Date r7 = r6.A09
            r12 = 0
            if (r7 == 0) goto L_0x0206
            if (r0 == 0) goto L_0x0206
            long r0 = r0.getTime()
            long r9 = r7.getTime()
            long r0 = r0 - r9
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r9.convert(r0, r7)
            r9 = 1
            long r0 = r0 + r9
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0206
            r9 = 365(0x16d, double:1.803E-321)
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0206
            int r7 = (int) r0
        L_0x0190:
            r11.setDatePeriod(r7)
            com.instagram.igds.components.datepicker.IgTimePicker r1 = r6.A05
            if (r1 == 0) goto L_0x0209
            int r0 = r6.A02
            r1.A00 = r0
            X.WXs r0 = new X.WXs
            r0.<init>(r6)
            r1.A04(r0)
            java.util.Date r0 = r6.A0A
            if (r0 == 0) goto L_0x01df
            java.util.Calendar r7 = r6.A07
            r9 = r18
            if (r7 == 0) goto L_0x01ce
            r7.setTime(r0)
        L_0x01b0:
            int r9 = r7.get(r3)
            int r2 = r7.get(r2)
            int r1 = r7.get(r8)
            r0 = 11
            int r12 = r7.get(r0)
            r0 = 12
            int r13 = r7.get(r0)
            com.instagram.igds.components.datepicker.IgDatePicker r0 = r6.A04
            if (r0 != 0) goto L_0x01d6
            r9 = r20
        L_0x01ce:
            X.0qQ.A0F(r9)
        L_0x01d1:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d6:
            r0.A02(r2, r1)
            com.instagram.igds.components.datepicker.IgTimePicker r0 = r6.A05
            if (r0 != 0) goto L_0x0215
            r9 = r14
            goto L_0x01ce
        L_0x01df:
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            java.util.Calendar r0 = r6.A07
            if (r0 != 0) goto L_0x01ea
            r9 = r18
            goto L_0x01ce
        L_0x01ea:
            java.util.Date r0 = r0.getTime()
            r7.setTime(r0)
            r0 = 11
            r7.add(r0, r3)
            r1 = 12
            int r0 = r7.get(r1)
            int r0 = r0 % 30
            int r0 = 30 - r0
            int r0 = r0 % 30
            r7.add(r1, r0)
            goto L_0x01b0
        L_0x0206:
            r7 = 365(0x16d, float:5.11E-43)
            goto L_0x0190
        L_0x0209:
            X.0qQ.A0F(r14)
            goto L_0x01d1
        L_0x020d:
            X.0qQ.A0F(r11)
            goto L_0x01d1
        L_0x0211:
            X.0qQ.A0F(r17)
            goto L_0x01d1
        L_0x0215:
            r8 = r0
            r10 = r2
            r11 = r1
            r8.A03(r9, r10, r11, r12, r13)
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0253
            r0 = 2131431324(0x7f0b0f9c, float:1.8484374E38)
            android.view.View r5 = X.DbY.A0F(r4, r0)
            r0 = 2131431322(0x7f0b0f9a, float:1.848437E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r5, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r2
            r2.setChecked(r3)
            r1 = 10
            X.WYN r0 = new X.WYN
            r0.<init>(r6, r1)
            r2.A07 = r0
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x0252
            android.content.Context r4 = r6.getThemedContext()
            int r0 = r6.A01
            float r3 = (float) r0
            int r2 = r6.A00
            X.8jL r1 = new X.8jL
            r0 = r19
            r1.<init>(r4, r3, r2, r0)
            r5.setBackground(r1)
        L_0x0252:
            return
        L_0x0253:
            A02(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15365UbI.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C15365UbI ubI, int i, int i2) {
        Calendar calendar = ubI.A07;
        if (calendar != null) {
            calendar.set(1, ubI.A0D);
            Calendar calendar2 = ubI.A07;
            if (calendar2 != null) {
                calendar2.set(2, i);
                Calendar calendar3 = ubI.A07;
                if (calendar3 != null) {
                    calendar3.set(5, i2);
                    Calendar calendar4 = ubI.A07;
                    if (calendar4 != null) {
                        calendar4.set(11, 0);
                        Calendar calendar5 = ubI.A07;
                        if (calendar5 != null) {
                            calendar5.set(12, 0);
                            Calendar calendar6 = ubI.A07;
                            if (calendar6 != null) {
                                calendar6.set(13, 0);
                                Calendar calendar7 = ubI.A07;
                                if (calendar7 != null) {
                                    if (calendar7.getTime().before(new Date())) {
                                        Calendar calendar8 = ubI.A07;
                                        if (calendar8 != null) {
                                            calendar8.add(1, 1);
                                        }
                                    }
                                    C74441Puw puw = ubI.A03;
                                    if (puw != null) {
                                        Calendar calendar9 = ubI.A07;
                                        if (calendar9 != null) {
                                            puw.D7r(calendar9.getTime());
                                            return;
                                        }
                                    } else {
                                        throw AnonymousClass7TE.A0y();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("datePickerCalendar");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C15365UbI ubI, boolean z) {
        String str;
        IgDatePicker igDatePicker = ubI.A04;
        if (igDatePicker == null) {
            str = "datePicker";
        } else {
            C294975nL.A06(new View[]{igDatePicker}, z);
            IgTimePicker igTimePicker = ubI.A05;
            if (igTimePicker == null) {
                str = "timePicker";
            } else {
                C294975nL.A07(new View[]{igTimePicker}, z);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03() {
        C74441Puw puw = this.A03;
        if (puw != null) {
            IgTimePicker igTimePicker = this.A05;
            Date date = null;
            if (igTimePicker == null) {
                0qQ.A0F("timePicker");
                throw AnonymousClass00P.createAndThrow();
            }
            Calendar selectedTime = igTimePicker.getSelectedTime();
            if (selectedTime != null) {
                date = selectedTime.getTime();
            }
            puw.D9n(date);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return false;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final String getModuleName() {
        return "datepicker";
    }

    public final AnonymousClass0wW getSession() {
        return this.A0E;
    }

    public final boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetClosed() {
        Calendar calendar = this.A07;
        String str = "datePickerCalendar";
        if (calendar != null) {
            calendar.setTime(new Date());
            IgDatePicker igDatePicker = this.A04;
            if (igDatePicker == null) {
                str = "datePicker";
            } else {
                Calendar calendar2 = this.A07;
                if (calendar2 != null) {
                    int A062 = DbZ.A06(calendar2);
                    Calendar calendar3 = this.A07;
                    if (calendar3 != null) {
                        igDatePicker.A02(A062, DbU.A03(calendar3));
                        IgTimePicker igTimePicker = this.A05;
                        if (igTimePicker == null) {
                            str = "timePicker";
                        } else {
                            igTimePicker.A01();
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C15365UbI ubI, Calendar calendar) {
        Date time = calendar.getTime();
        C74441Puw puw = ubI.A03;
        if (puw != null) {
            if (time.before(new Date()) && !ubI.A0F) {
                time = null;
            }
            puw.D7r(time);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-248749324);
        C15365UbI.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0E = DbS.A0U(bundle2);
            this.A01 = C13989Tnp.A0A(getThemedContext());
            this.A00 = 2Yu.A0H(getThemedContext(), R.attr.igds_color_elevated_separator);
            Calendar instance = Calendar.getInstance();
            this.A07 = instance;
            if (instance == null) {
                0qQ.A0F("datePickerCalendar");
                throw AnonymousClass00P.createAndThrow();
            }
            this.A0D = instance.get(1);
            this.A0B = bundle2.getBoolean(C66579MXk.A00(837));
            this.A0A = (Date) bundle2.getSerializable(C66579MXk.A00(836));
            this.A09 = (Date) bundle2.getSerializable(C66579MXk.A00(832));
            this.A08 = (Date) bundle2.getSerializable(C66579MXk.A00(831));
            this.A0C = bundle2.getBoolean(C66579MXk.A00(838));
            this.A06 = bundle2.getString(C66579MXk.A00(833));
            this.A02 = bundle2.getInt(C66579MXk.A00(835), 5);
            this.A0F = bundle2.getBoolean(C66579MXk.A00(834));
            AnonymousClass0fD.A09(-1725468548, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(130883312, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1701074628);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.date_picker_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-1426881226, A022);
        return inflate;
    }
}
