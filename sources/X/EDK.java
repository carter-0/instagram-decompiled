package X;

import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.user.model.User;

public final class EDK extends 1P0 {
    public final /* synthetic */ ReelAutoArchiveSettingStr A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ User A02;

    public EDK(ReelAutoArchiveSettingStr reelAutoArchiveSettingStr, 1P0 r2, User user) {
        this.A01 = r2;
        this.A02 = user;
        this.A00 = reelAutoArchiveSettingStr;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, -1691737502);
        User user = this.A02;
        user.A03.Ehx(this.A00);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onFail(r4);
        }
        AnonymousClass0fD.A0A(-472732834, A0D);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 749183660);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onFailInBackground(r3);
        }
        AnonymousClass0fD.A0A(278542365, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1638675820);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onFinish();
        }
        AnonymousClass0fD.A0A(931451157, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(326382319);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onStart();
        }
        AnonymousClass0fD.A0A(-1772195725, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(82915879);
        int A0D = AnonymousClass7TG.A0D(obj, 790200731);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onSuccess(obj);
        }
        AnonymousClass0fD.A0A(-1636869653, A0D);
        AnonymousClass0fD.A0A(-1384434117, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1027514751);
        int A0D = AnonymousClass7TG.A0D(obj, -1479147455);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onSuccessInBackground(obj);
        }
        AnonymousClass0fD.A0A(2051485954, A0D);
        AnonymousClass0fD.A0A(43006761, A03);
    }
}
