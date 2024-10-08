package com.instagram.igds.components.datepicker;

import X.0qQ;
import X.AnonymousClass00P;
import X.C71382cm;
import X.JTO;
import X.WD5;
import X.X4D;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public final class IgTimePicker extends LinearLayout {
    public int A00 = 5;
    public Calendar A01;
    public NumberPicker A02;
    public NumberPicker A03;
    public NumberPicker A04;
    public NumberPicker A05;
    public boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1L, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.time_picker_layout);
        obtainStyledAttributes.recycle();
        View.inflate(context, resourceId, this);
        this.A03 = (NumberPicker) requireViewById(R.id.date_picker);
        this.A04 = (NumberPicker) requireViewById(R.id.hour_picker);
        this.A05 = (NumberPicker) requireViewById(R.id.minute_picker);
        this.A02 = (NumberPicker) requireViewById(R.id.ampm_picker);
        NumberPicker numberPicker = this.A03;
        String str = "datePicker";
        if (numberPicker != null) {
            numberPicker.setWrapSelectorWheel(false);
            NumberPicker numberPicker2 = this.A03;
            if (numberPicker2 != null) {
                numberPicker2.setMinValue(0);
                NumberPicker numberPicker3 = this.A03;
                if (numberPicker3 != null) {
                    numberPicker3.setMaxValue(365);
                    NumberPicker numberPicker4 = this.A02;
                    if (numberPicker4 == null) {
                        str = "ampmPicker";
                    } else {
                        numberPicker4.setWrapSelectorWheel(false);
                        this.A01 = Calendar.getInstance();
                        this.A06 = DateFormat.is24HourFormat(context);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final int getNumberOfDaysInPickerRange() {
        NumberPicker numberPicker = this.A03;
        if (numberPicker != null) {
            int maxValue = numberPicker.getMaxValue();
            NumberPicker numberPicker2 = this.A03;
            if (numberPicker2 != null) {
                return (maxValue - numberPicker2.getMinValue()) + 1;
            }
        }
        0qQ.A0F("datePicker");
        throw AnonymousClass00P.createAndThrow();
    }

    private final int getSelectedHourOfDay() {
        boolean z = this.A06;
        String str = "hourPicker";
        NumberPicker numberPicker = this.A04;
        if (z) {
            if (numberPicker != null) {
                return numberPicker.getValue();
            }
        } else if (numberPicker != null) {
            int value = numberPicker.getValue() % 12;
            NumberPicker numberPicker2 = this.A02;
            if (numberPicker2 != null) {
                return value + (numberPicker2.getValue() * 12);
            }
            str = "ampmPicker";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final int getSelectedMinute() {
        NumberPicker numberPicker = this.A05;
        if (numberPicker != null) {
            return numberPicker.getValue() * this.A00;
        }
        0qQ.A0F("minutePicker");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01() {
        String str;
        NumberPicker numberPicker = this.A03;
        if (numberPicker == null) {
            str = "datePicker";
        } else {
            numberPicker.setValue(0);
            NumberPicker numberPicker2 = this.A04;
            if (numberPicker2 == null) {
                str = "hourPicker";
            } else {
                numberPicker2.setValue(0);
                NumberPicker numberPicker3 = this.A05;
                if (numberPicker3 == null) {
                    str = "minutePicker";
                } else {
                    numberPicker3.setValue(0);
                    if (!this.A06) {
                        NumberPicker numberPicker4 = this.A02;
                        if (numberPicker4 == null) {
                            str = "ampmPicker";
                        } else {
                            numberPicker4.setValue(0);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Calendar getSelectedDate() {
        Calendar calendar;
        String str;
        Calendar calendar2 = this.A01;
        if (calendar2 == null) {
            str = "startDate";
        } else {
            Object clone = calendar2.clone();
            if (!(clone instanceof Calendar) || (calendar = (Calendar) clone) == null) {
                return null;
            }
            NumberPicker numberPicker = this.A03;
            if (numberPicker == null) {
                str = "datePicker";
            } else {
                calendar.add(5, numberPicker.getValue());
                return calendar;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Calendar getSelectedTime() {
        Calendar calendar;
        String str;
        Calendar calendar2 = this.A01;
        if (calendar2 == null) {
            str = "startDate";
        } else {
            Object clone = calendar2.clone();
            if (!(clone instanceof Calendar) || (calendar = (Calendar) clone) == null) {
                return null;
            }
            NumberPicker numberPicker = this.A03;
            if (numberPicker == null) {
                str = "datePicker";
            } else {
                calendar.add(5, numberPicker.getValue());
                calendar.set(11, getSelectedHourOfDay());
                calendar.set(12, getSelectedMinute());
                return calendar;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setDatePeriod(int i) {
        NumberPicker numberPicker = this.A03;
        if (numberPicker == null) {
            0qQ.A0F("datePicker");
            throw AnonymousClass00P.createAndThrow();
        } else {
            numberPicker.setMaxValue(i - 1);
        }
    }

    public final void setIs24HourView(boolean z) {
        this.A06 = z;
    }

    public final void setMinuteIntervalLength(int i) {
        this.A00 = i;
    }

    public final void A02(int i, int i2, int i3) {
        String str;
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        NumberPicker numberPicker = this.A03;
        if (numberPicker == null) {
            str = "datePicker";
        } else {
            Calendar calendar = this.A01;
            if (calendar == null) {
                str = "startDate";
            } else {
                numberPicker.setValue(JTO.A05((float) (instance.getTimeInMillis() - calendar.getTimeInMillis()), 8.64E7f));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r8.A02(r9, r10, r11)
            boolean r2 = r8.A06
            java.lang.String r0 = "hourPicker"
            android.widget.NumberPicker r1 = r8.A04
            if (r2 != 0) goto L_0x0024
            if (r1 == 0) goto L_0x001c
            long r2 = (long) r12
            r6 = 12
            long r4 = r2 % r6
            int r0 = (int) r4
            r1.setValue(r0)
            android.widget.NumberPicker r1 = r8.A02
            if (r1 != 0) goto L_0x002a
            java.lang.String r0 = "ampmPicker"
        L_0x001c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            if (r1 == 0) goto L_0x001c
            r1.setValue(r12)
            goto L_0x0033
        L_0x002a:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r0 = X.Pxf.A1R(r0)
            r1.setValue(r0)
        L_0x0033:
            android.widget.NumberPicker r1 = r8.A05
            if (r1 != 0) goto L_0x003a
            java.lang.String r0 = "minutePicker"
            goto L_0x001c
        L_0x003a:
            int r0 = r8.A00
            int r13 = r13 / r0
            r1.setValue(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.datepicker.IgTimePicker.A03(int, int, int, int, int):void");
    }

    public final void A04(X4D x4d) {
        Calendar calendar;
        int i;
        String str;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "EEE MMM dd"), Locale.getDefault());
        int numberOfDaysInPickerRange = getNumberOfDaysInPickerRange();
        String[] strArr = new String[numberOfDaysInPickerRange];
        Calendar calendar2 = this.A01;
        if (calendar2 == null) {
            str = "startDate";
        } else {
            Object clone = calendar2.clone();
            if (clone instanceof Calendar) {
                calendar = (Calendar) clone;
            } else {
                calendar = null;
            }
            if (calendar != null) {
                for (int i2 = 0; i2 < numberOfDaysInPickerRange; i2++) {
                    strArr[i2] = simpleDateFormat.format(calendar.getTime());
                    calendar.add(5, 1);
                }
            }
            NumberPicker numberPicker = this.A03;
            if (numberPicker != null) {
                numberPicker.setDisplayedValues(strArr);
                NumberPicker numberPicker2 = this.A04;
                if (numberPicker2 != null) {
                    numberPicker2.setMinValue(1);
                    boolean z = this.A06;
                    NumberPicker numberPicker3 = this.A04;
                    if (z) {
                        if (numberPicker3 != null) {
                            i = 24;
                        }
                    } else if (numberPicker3 != null) {
                        i = 12;
                    }
                    numberPicker3.setMaxValue(i);
                    NumberPicker numberPicker4 = this.A05;
                    str = "minutePicker";
                    if (numberPicker4 != null) {
                        numberPicker4.setMinValue(0);
                        int i3 = 60 / this.A00;
                        NumberPicker numberPicker5 = this.A05;
                        if (numberPicker5 != null) {
                            numberPicker5.setMaxValue(i3 - 1);
                            String[] strArr2 = new String[i3];
                            for (int i4 = 0; i4 < i3; i4++) {
                                strArr2[i4] = StringFormatUtil.formatStrLocaleSafe("%02d", Integer.valueOf(this.A00 * i4));
                            }
                            NumberPicker numberPicker6 = this.A05;
                            if (numberPicker6 != null) {
                                numberPicker6.setDisplayedValues(strArr2);
                                boolean z2 = this.A06;
                                NumberPicker numberPicker7 = this.A02;
                                if (z2) {
                                    if (numberPicker7 != null) {
                                        numberPicker7.setVisibility(8);
                                    }
                                    0qQ.A0F("ampmPicker");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                if (numberPicker7 != null) {
                                    numberPicker7.setMinValue(0);
                                    NumberPicker numberPicker8 = this.A02;
                                    if (numberPicker8 != null) {
                                        numberPicker8.setMaxValue(1);
                                        NumberPicker numberPicker9 = this.A02;
                                        if (numberPicker9 != null) {
                                            Context context = getContext();
                                            numberPicker9.setDisplayedValues(new String[]{context.getString(2131963733), context.getString(2131963734)});
                                        }
                                    }
                                }
                                0qQ.A0F("ampmPicker");
                                throw AnonymousClass00P.createAndThrow();
                                WD5 wd5 = new WD5(2, (Object) x4d, (Object) this);
                                NumberPicker numberPicker10 = this.A03;
                                if (numberPicker10 != null) {
                                    numberPicker10.setOnValueChangedListener(wd5);
                                    NumberPicker numberPicker11 = this.A04;
                                    if (numberPicker11 != null) {
                                        numberPicker11.setOnValueChangedListener(wd5);
                                        NumberPicker numberPicker12 = this.A05;
                                        if (numberPicker12 != null) {
                                            numberPicker12.setOnValueChangedListener(wd5);
                                            if (!this.A06) {
                                                NumberPicker numberPicker13 = this.A02;
                                                if (numberPicker13 != null) {
                                                    numberPicker13.setOnValueChangedListener(wd5);
                                                    return;
                                                }
                                                0qQ.A0F("ampmPicker");
                                                throw AnonymousClass00P.createAndThrow();
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F("hourPicker");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("datePicker");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgTimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgTimePicker(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context, (AttributeSet) null);
    }
}
