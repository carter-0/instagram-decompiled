package com.instagram.igds.components.datepicker;

import X.0qQ;
import X.AnonymousClass00P;
import X.C71382cm;
import X.DbU;
import X.DbW;
import X.DbZ;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.instagram.android.R;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class IgDatePicker extends LinearLayout {
    public NumberPicker A00;
    public NumberPicker A01;
    public int A02;
    public int A03;
    public int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    public final void setMaxDate(Calendar calendar) {
        0qQ.A0B(calendar, 0);
        NumberPicker numberPicker = this.A01;
        if (numberPicker == null) {
            0qQ.A0F("monthPicker");
            throw AnonymousClass00P.createAndThrow();
        }
        numberPicker.setMaxValue(DbZ.A06(calendar));
        this.A03 = DbU.A03(calendar);
    }

    public final void setMinDate(Calendar calendar) {
        0qQ.A0B(calendar, 0);
        NumberPicker numberPicker = this.A01;
        if (numberPicker == null) {
            0qQ.A0F("monthPicker");
            throw AnonymousClass00P.createAndThrow();
        }
        numberPicker.setMinValue(DbZ.A06(calendar));
        this.A04 = DbU.A03(calendar);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A12, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.date_picker_layout);
        obtainStyledAttributes.recycle();
        View.inflate(context, resourceId, this);
        this.A01 = (NumberPicker) requireViewById(R.id.month_picker);
        this.A00 = (NumberPicker) requireViewById(R.id.day_picker);
        NumberPicker numberPicker = this.A01;
        if (numberPicker != null) {
            numberPicker.setWrapSelectorWheel(false);
            NumberPicker numberPicker2 = this.A00;
            if (numberPicker2 != null) {
                numberPicker2.setWrapSelectorWheel(false);
                NumberPicker numberPicker3 = this.A01;
                if (numberPicker3 != null) {
                    numberPicker3.setMinValue(1);
                    NumberPicker numberPicker4 = this.A01;
                    if (numberPicker4 != null) {
                        numberPicker4.setMaxValue(12);
                        NumberPicker numberPicker5 = this.A00;
                        if (numberPicker5 != null) {
                            numberPicker5.setMinValue(1);
                            NumberPicker numberPicker6 = this.A00;
                            if (numberPicker6 != null) {
                                numberPicker6.setMaxValue(30);
                                this.A04 = 0;
                                this.A03 = 0;
                                this.A02 = Calendar.getInstance().get(1);
                                return;
                            }
                        }
                    }
                }
            }
            0qQ.A0F("dayPicker");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("monthPicker");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(IgDatePicker igDatePicker, int i) {
        NumberPicker numberPicker;
        int i2;
        int i3;
        NumberPicker numberPicker2 = igDatePicker.A01;
        if (numberPicker2 != null) {
            if (i != numberPicker2.getMinValue() || (i3 = igDatePicker.A04) == 0) {
                NumberPicker numberPicker3 = igDatePicker.A01;
                if (numberPicker3 != null) {
                    i3 = 1;
                    if (i == numberPicker3.getMaxValue() && igDatePicker.A03 != 0) {
                        NumberPicker numberPicker4 = igDatePicker.A00;
                        if (numberPicker4 != null) {
                            numberPicker4.setMinValue(1);
                            numberPicker = igDatePicker.A00;
                            if (numberPicker != null) {
                                i2 = igDatePicker.A03;
                                numberPicker.setMaxValue(i2);
                                return;
                            }
                        }
                        0qQ.A0F("dayPicker");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            NumberPicker numberPicker5 = igDatePicker.A00;
            if (numberPicker5 != null) {
                numberPicker5.setMinValue(i3);
                numberPicker = igDatePicker.A00;
                if (numberPicker != null) {
                    int i4 = igDatePicker.A02;
                    switch (i + 1) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            i2 = 31;
                            break;
                        case 2:
                            boolean isLeapYear = new GregorianCalendar().isLeapYear(i4);
                            i2 = 28;
                            if (isLeapYear) {
                                i2 = 29;
                                break;
                            }
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            i2 = 30;
                            break;
                        default:
                            throw DbW.A0a("Not a valid month: ", i);
                    }
                    numberPicker.setMaxValue(i2);
                    return;
                }
            }
            0qQ.A0F("dayPicker");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("monthPicker");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getCurrentDayOfMonth() {
        NumberPicker numberPicker = this.A00;
        if (numberPicker != null) {
            return numberPicker.getValue();
        }
        0qQ.A0F("dayPicker");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getCurrentMonth() {
        NumberPicker numberPicker = this.A01;
        if (numberPicker != null) {
            return numberPicker.getValue();
        }
        0qQ.A0F("monthPicker");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02(int i, int i2) {
        String str;
        A01(this, i);
        NumberPicker numberPicker = this.A01;
        if (numberPicker == null) {
            str = "monthPicker";
        } else {
            numberPicker.setValue(i);
            NumberPicker numberPicker2 = this.A00;
            if (numberPicker2 == null) {
                str = "dayPicker";
            } else {
                numberPicker2.setValue(i2);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgDatePicker(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context, (AttributeSet) null);
    }
}
