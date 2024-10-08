package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;

public final class K4R extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LimitsPlusWhenReminderBottomSheetFragment";
    public NumberPicker A00;
    public NumberPicker A01;
    public C54166H1l A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return "limits_plus_set_reminder_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        int i;
        Object value;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C60251Ji8 ji8 = (C60251Ji8) this.A04.getValue();
        L30 l30 = new L30(this);
        long A042 = DbY.A04((Number) ((C53389GnL) ji8.A01.A01.getValue()).A04);
        ji8.A00 = l30;
        C54166H1l h1l = l30.A00.A02;
        if (h1l != null) {
            h1l.A00 = A042;
        }
        long A0P = A042 - AnonymousClass7TE.A0P(JTU.A04());
        long j = A0P / 604800;
        float f = (float) j;
        if (f > 0.0f) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        if (f > 0.0f) {
            i = (int) Math.ceil((double) j);
        } else {
            i = (int) (A0P / SandboxRepository.CACHE_TTL);
        }
        05G r4 = ji8.A03;
        do {
            value = r4.getValue();
            0qQ.A0B(num, 0);
        } while (!r4.AIY(value, new C60922Jtg(num, i, A042)));
        07U r10 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHK((Object) viewLifecycleOwner, (Object) r10, (Object) this, (AnonymousClass4D7) null, 22), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(K4R k4r, Integer num, boolean z) {
        int i;
        NumberPicker numberPicker = k4r.A01;
        if (numberPicker != null) {
            numberPicker.setDisplayedValues((String[]) null);
            int i2 = 4;
            if (num == AnonymousClass05K.A00) {
                i2 = 6;
            }
            NumberPicker numberPicker2 = k4r.A01;
            if (numberPicker2 != null) {
                int i3 = 0;
                numberPicker2.setMinValue(0);
                NumberPicker numberPicker3 = k4r.A01;
                if (numberPicker3 != null) {
                    numberPicker3.setMaxValue(i2 - 1);
                    NumberPicker numberPicker4 = k4r.A01;
                    if (numberPicker4 != null) {
                        String[] strArr = new String[i2];
                        do {
                            i = i3 + 1;
                            strArr[i3] = String.valueOf(i);
                            i3 = i;
                        } while (i < i2);
                        numberPicker4.setDisplayedValues(strArr);
                        if (z) {
                            C60251Ji8 ji8 = (C60251Ji8) k4r.A04.getValue();
                            NumberPicker numberPicker5 = k4r.A01;
                            if (numberPicker5 != null) {
                                ji8.A01(numberPicker5.getValue() + 1);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F("unitsPicker");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public K4R() {
        C58175Inf inf = new C58175Inf(this, 18);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58175Inf(new C58175Inf(this, 15), 16));
        this.A04 = DbS.A0I(new C58175Inf(A002, 17), inf, new MJ6(25, (Object) null, A002), DbS.A0z(C60251Ji8.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1422068239);
        K4R.super.onCreate(bundle);
        AnonymousClass0fD.A09(-1324753542, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1352838058);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.limits_plus_reminder_bottomsheet_layout, viewGroup, false);
        TextView A0B = DbW.A0B(inflate, R.id.reminder_sub_text);
        if (AnonymousClass7TF.A0R(0Tu.A05, DbT.A0X(this.A03), 36326292223702702L).booleanValue()) {
            DbU.A1G(A0B, this, 2131965041);
        }
        this.A01 = (NumberPicker) inflate.requireViewById(R.id.units_picker);
        this.A00 = (NumberPicker) inflate.requireViewById(R.id.duration_picker);
        AnonymousClass0fD.A09(-1606366681, A022);
        return inflate;
    }
}
