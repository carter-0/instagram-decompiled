package X;

import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;

/* renamed from: X.Wez  reason: case insensitive filesystem */
public final class C19758Wez implements C21001X8y {
    public final /* synthetic */ C15277UZf A00;

    public C19758Wez(C15277UZf uZf) {
        this.A00 = uZf;
    }

    public final IgTextView BPP() {
        IgTextView igTextView = this.A00.A06;
        if (igTextView != null) {
            return igTextView;
        }
        0qQ.A0F("ageMaxText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgTextView BTF() {
        IgTextView igTextView = this.A00.A07;
        if (igTextView != null) {
            return igTextView;
        }
        0qQ.A0F("ageMinText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final float Bj8() {
        return (float) this.A00.A00;
    }

    public final RangeSeekBar BjA() {
        RangeSeekBar rangeSeekBar = this.A00.A0B;
        if (rangeSeekBar != null) {
            return rangeSeekBar;
        }
        0qQ.A0F("ageRangeSeekBar");
        throw AnonymousClass00P.createAndThrow();
    }

    public final float BjB() {
        return (float) this.A00.A01;
    }
}
