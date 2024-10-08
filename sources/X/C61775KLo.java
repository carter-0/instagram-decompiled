package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KLo  reason: case insensitive filesystem */
public final class C61775KLo extends C65059Lmd {
    public View A00;
    public View A01;
    public final C60382Jkb A02;
    public final L44 A03;
    public final 0sP A04;
    public final AnonymousClass5MI A05;
    public final A9J A06;

    public C61775KLo(AnonymousClass5MI r3, A9J a9j, L44 l44) {
        0qQ.A0B(a9j, 2);
        this.A03 = l44;
        this.A06 = a9j;
        this.A05 = r3;
        MP5 A002 = MP5.A00(this, 48);
        this.A04 = A002;
        this.A02 = new C61774KLn(A002);
    }

    public final void CN3(ViewGroup viewGroup) {
        boolean A0K;
        C376699Iz CAA;
        VoiceOption voiceOption;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 0);
        RecyclerView A0F = DbZ.A0F(viewGroup2, R.id.text_to_speech_recycler_view);
        String str = "contentView";
        String str2 = null;
        if (A0F != null) {
            this.A00 = A0F;
            View findViewById = viewGroup2.findViewById(R.id.text_to_speech_content);
            this.A00 = findViewById;
            if (findViewById != null) {
                this.A01 = findViewById.findViewById(R.id.text_to_speech_done_button);
                return;
            }
        } else {
            View inflate = DbV.A0D(viewGroup2).inflate(R.layout.layout_tts_bottom_sheet, (ViewGroup) null, false);
            this.A00 = inflate;
            if (inflate != null) {
                RecyclerView A0F2 = DbZ.A0F(inflate, R.id.text_to_speech_recycler_view);
                0qQ.A0B(A0F2, 0);
                this.A00 = A0F2;
                View view = this.A00;
                if (view != null) {
                    View findViewById2 = view.findViewById(R.id.text_to_speech_done_button);
                    this.A01 = findViewById2;
                    if (findViewById2 == null) {
                        str = "doneButton";
                    } else {
                        LYB.A00(findViewById2, 0, this);
                        View view2 = this.A00;
                        if (view2 != null) {
                            viewGroup2.addView(view2, new LinearLayout.LayoutParams(-1, -1));
                            A00().setLayoutManager(new GridLayoutManager(A00().getContext(), 3, 1, false));
                            RecyclerView A002 = A00();
                            C60382Jkb jkb = this.A02;
                            A002.setAdapter(jkb);
                            AnonymousClass5MI r0 = this.A05;
                            if (!(r0 == null || (CAA = r0.CAA()) == null || (voiceOption = (VoiceOption) CAA.A01) == null)) {
                                str2 = voiceOption.A00;
                            }
                            A9J a9j = this.A06;
                            List A003 = a9j.A00();
                            ArrayList A0r = AnonymousClass7TG.A0r(A003);
                            int i = 0;
                            for (Object next : A003) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    0sr.A1T();
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                VoiceOption voiceOption2 = (VoiceOption) next;
                                String str3 = voiceOption2.A00;
                                String A11 = DbT.A11(voiceOption2, a9j.A01());
                                if (i == 0) {
                                    if (str2 != null) {
                                        A0K = false;
                                        if (str2.length() != 0) {
                                        }
                                    }
                                    A0K = true;
                                } else {
                                    A0K = 0qQ.A0K(str3, str2);
                                }
                                A0r.add(new C61184Jyd(str3, A11, 0, A0K, false));
                                i = i2;
                            }
                            jkb.A00(A0r);
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
