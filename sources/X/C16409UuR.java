package X;

import com.instagram.android.R;

/* renamed from: X.UuR  reason: case insensitive filesystem */
public final class C16409UuR extends WYP {
    public C17517VYv A00 = new C17517VYv((Integer) null, R.layout.clips_prism_media_interactivity_tooltip, R.id.clips_prism_tooltip_title_text, R.id.clips_prism_tooltip_subtitle_text);
    public final CharSequence A01;
    public final CharSequence A02;

    public final /* bridge */ /* synthetic */ void ADq(C283255Gu r3, C284395Mi r4) {
        C15993Uma uma = (C15993Uma) r4;
        0qQ.A0B(uma, 0);
        CharSequence charSequence = this.A02;
        if (charSequence.length() > 0) {
            uma.A01.setText(charSequence);
        }
        CharSequence charSequence2 = this.A01;
        if (charSequence2.length() > 0) {
            uma.A00.setText(charSequence2);
        }
    }

    public C16409UuR(CharSequence charSequence, CharSequence charSequence2) {
        this.A02 = charSequence;
        this.A01 = charSequence2;
    }
}
