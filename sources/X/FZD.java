package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;
import java.io.IOException;

public final class FZD implements MTS {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public FZD(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A02 = obj3;
        this.A05 = obj4;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj5;
    }

    public final void onFailure(Exception exc) {
        Context context;
        String str;
        switch (this.A00) {
            case 0:
                0qQ.A0B(exc, 0);
                context = (Context) this.A02;
                AnonymousClass7TF.A19(0wj.A01.AEf("IGBloksActionFanClubCreateWelcomeStoryImpl", 817892933), "IGBloksActionFanClubCreateWelcomeStoryImpl", exc.getMessage(), exc);
                str = "shareToStory_unknown_error_occurred";
                break;
            case 1:
                context = (Context) this.A01;
                str = "shareInfoCenterToStory_unknown_error_occured";
                break;
            case 2:
                context = (Context) this.A01;
                str = "shareInfoCenterFactToStory_unknown_error_occured";
                break;
            default:
                context = (Context) this.A01;
                str = AnonymousClass000.A00(276);
                break;
        }
        C59689JTv.A0C(context, str);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass6W8 A022;
        Activity activity;
        0lg r3;
        Bundle bundle;
        Class<TransparentModalActivity> cls;
        int i;
        int i2;
        Context context;
        switch (this.A00) {
            case 0:
                try {
                    Bundle A002 = Q21.A00(DbW.A1b("ARG_WELCOME_STORY_FILE_PATH", Dba.A0T(obj).getCanonicalPath()));
                    Activity activity2 = (Activity) this.A01;
                    A022 = AnonymousClass6W8.A02(activity2, A002, (0lg) this.A05, TransparentModalActivity.class, C273654mx.A00(688));
                    ((1Ng) this.A03).A01((1wn) this.A04, AnonymousClass3S3.class);
                    context = activity2;
                    break;
                } catch (IOException e) {
                    AnonymousClass7TF.A19(0wj.A01.AEf("IGBloksActionFanClubCreateWelcomeStoryImpl", 817892933), "IGBloksActionFanClubCreateWelcomeStoryImpl", e.getMessage(), e);
                    C59689JTv.A0C((Context) this.A02, "shareToStory_unknown_error_occurred");
                    return;
                }
            case 1:
                bundle = AnonymousClass7TE.A0a();
                bundle.putParcelable(AnonymousClass000.A00(121), (RectF) this.A02);
                bundle.putParcelable(AnonymousClass000.A00(122), (RectF) this.A03);
                bundle.putString(AnonymousClass000.A00(120), ((File) obj).getAbsolutePath());
                bundle.putParcelable(AnonymousClass000.A00(2448), (Parcelable) this.A04);
                bundle.putParcelable(AnonymousClass000.A00(119), (Parcelable) null);
                r3 = (0lg) this.A05;
                cls = TransparentModalActivity.class;
                i = 920;
                activity = (Activity) this.A01;
                break;
            case 2:
                File file = (File) obj;
                bundle = AnonymousClass7TE.A0a();
                bundle.putParcelable(AnonymousClass000.A00(121), (RectF) this.A02);
                bundle.putParcelable(AnonymousClass000.A00(122), (RectF) this.A03);
                bundle.putParcelable(AnonymousClass000.A00(119), (Parcelable) null);
                try {
                    bundle.putString(AnonymousClass000.A00(120), file.getCanonicalPath());
                } catch (IOException unused) {
                    i2 = 2256;
                    break;
                } catch (SecurityException unused2) {
                    i2 = 2257;
                    break;
                }
                bundle.putParcelable(AnonymousClass000.A00(2447), (Parcelable) this.A04);
                r3 = (0lg) this.A05;
                cls = TransparentModalActivity.class;
                i = 919;
                activity = (Activity) this.A01;
                break;
            default:
                File A0T = Dba.A0T(obj);
                Bundle bundle2 = (Bundle) this.A02;
                bundle2.putString(AnonymousClass000.A00(2453), A0T.getCanonicalPath());
                A022 = AnonymousClass6W8.A02((Activity) this.A01, bundle2, (0lg) this.A05, TransparentModalActivity.class, C273654mx.A00(378));
                A022.A0E((C273434mZ) this.A04);
                context = (Context) this.A03;
                break;
        }
        A022 = AnonymousClass6W8.A02(activity, bundle, r3, cls, C273654mx.A00(i));
        context = activity;
        A022.A0C(context);
        0wb.A03("ReelInfoCenterShareHelper", AnonymousClass000.A00(i2));
        bundle.putParcelable(AnonymousClass000.A00(2447), (Parcelable) this.A04);
        r3 = (0lg) this.A05;
        cls = TransparentModalActivity.class;
        i = 919;
        activity = (Activity) this.A01;
        A022 = AnonymousClass6W8.A02(activity, bundle, r3, cls, C273654mx.A00(i));
        context = activity;
        A022.A0C(context);
    }
}
