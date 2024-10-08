package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.instagram.android.R;

public final class K46 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MusicOverlayEditMusicDurationFragment";
    public View A00;
    public NumberPicker A01;
    public AnonymousClass9Y9 A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "music_duration_picker";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = DbW.A0F(this).A00(AnonymousClass9Y9.class);
        View requireViewById = view.requireViewById(R.id.music_duration_picker_sheet);
        this.A00 = requireViewById;
        String str = "durationPickerSheet";
        if (requireViewById != null) {
            AnonymousClass0fU.A00(new WBA((Object) this, 53), AnonymousClass7TF.A0G(requireViewById, R.id.music_duration_picker_done_button));
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                int i = bundle2.getInt(AnonymousClass000.A00(2645), 15);
                View view2 = this.A00;
                if (view2 != null) {
                    NumberPicker numberPicker = (NumberPicker) view2.requireViewById(R.id.music_duration_number_picker);
                    this.A01 = numberPicker;
                    str = "numberPicker";
                    if (numberPicker != null) {
                        numberPicker.setMinValue(5);
                        NumberPicker numberPicker2 = this.A01;
                        if (numberPicker2 != null) {
                            numberPicker2.setMaxValue(i);
                            int i2 = (i - 5) + 1;
                            String[] strArr = new String[i2];
                            NumberPicker numberPicker3 = this.A01;
                            if (numberPicker3 != null) {
                                String A16 = AnonymousClass7TE.A16(numberPicker3.getContext(), 2131967758);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    strArr[i3] = JTR.A14(A16, AnonymousClass7TF.A1b(i3 + 5), 1);
                                }
                                NumberPicker numberPicker4 = this.A01;
                                if (numberPicker4 != null) {
                                    numberPicker4.setDisplayedValues(strArr);
                                    NumberPicker numberPicker5 = this.A01;
                                    if (numberPicker5 != null) {
                                        numberPicker5.setOnValueChangedListener(new LZK(this, 0));
                                        NumberPicker numberPicker6 = this.A01;
                                        if (numberPicker6 != null) {
                                            numberPicker6.setWrapSelectorWheel(false);
                                            NumberPicker numberPicker7 = this.A01;
                                            if (numberPicker7 != null) {
                                                numberPicker7.setDescendantFocusability(393216);
                                                NumberPicker numberPicker8 = this.A01;
                                                if (numberPicker8 != null) {
                                                    AnonymousClass9Y9 r0 = this.A02;
                                                    if (r0 == null) {
                                                        str = "musicOverlayDurationViewModel";
                                                    } else {
                                                        numberPicker8.setValue(AnonymousClass7TG.A0A((Number) r0.A00.A02()));
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
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1264175080);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.music_duration_picker, viewGroup, false);
        AnonymousClass0fD.A09(-1523788427, A022);
        return inflate;
    }
}
