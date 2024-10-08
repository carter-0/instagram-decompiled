package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

public final class SxD implements C13633Tdz {
    public final /* synthetic */ C9146RQx A00;
    public final /* synthetic */ Te3 A01;
    public final /* synthetic */ C13470Tax A02;
    public final /* synthetic */ C365498nD A03;

    public SxD(C9146RQx rQx, Te3 te3, C13470Tax tax, C365498nD r4) {
        this.A00 = rQx;
        this.A03 = r4;
        this.A01 = te3;
        this.A02 = tax;
    }

    public final void D52(Status status) {
        if (status.A00 <= 0) {
            C9146RQx rQx = this.A00;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) rQx;
            AnonymousClass3Qk.A09(!basePendingResult.A0C, "Result has already been consumed.");
            try {
                if (!basePendingResult.A0A.await(0, timeUnit)) {
                    basePendingResult.A08(Status.A0A);
                }
            } catch (InterruptedException unused) {
                basePendingResult.A08(Status.A07);
            }
            AnonymousClass3Qk.A09(AnonymousClass7TF.A1Q((basePendingResult.A0A.getCount() > 0 ? 1 : (basePendingResult.A0A.getCount() == 0 ? 0 : -1))), "Result is not ready.");
            this.A03.A01(this.A01.AJr(BasePendingResult.A00(basePendingResult)));
            return;
        }
        this.A03.A00(C9698RfG.A00(status));
    }
}
