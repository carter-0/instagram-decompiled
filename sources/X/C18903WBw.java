package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;

/* renamed from: X.WBw  reason: case insensitive filesystem */
public final class C18903WBw implements View.OnTouchListener {
    public GestureDetector A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ LOO A03;
    public final /* synthetic */ ExistingStandaloneFundraiserForFeedModel A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public C18903WBw(LOO loo, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel, String str, String str2, String str3, List list, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = loo;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = j;
        this.A07 = str3;
        this.A01 = j2;
        this.A0C = z;
        this.A09 = z2;
        this.A0D = z3;
        this.A0A = z4;
        this.A08 = list;
        this.A0B = z5;
        this.A04 = existingStandaloneFundraiserForFeedModel;
        this.A00 = new GestureDetector(loo.A01.getContext(), new C14707U2r(this, 1));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00.onTouchEvent(motionEvent);
    }
}
