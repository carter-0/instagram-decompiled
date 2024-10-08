package X;

import android.content.Intent;
import android.net.Uri;
import com.instagram.share.handleractivity.CustomStoryShareHandlerActivity;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.TKo  reason: case insensitive filesystem */
public final class C13082TKo implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ Uri A03;
    public final /* synthetic */ Uri A04;
    public final /* synthetic */ C61058Jvw A05;
    public final /* synthetic */ 0lg A06;
    public final /* synthetic */ CustomStoryShareHandlerActivity A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ HashMap A09;

    public C13082TKo(Intent intent, Uri uri, Uri uri2, C61058Jvw jvw, 0lg r5, CustomStoryShareHandlerActivity customStoryShareHandlerActivity, String str, HashMap hashMap, int i, int i2) {
        this.A07 = customStoryShareHandlerActivity;
        this.A06 = r5;
        this.A02 = intent;
        this.A04 = uri;
        this.A03 = uri2;
        this.A05 = jvw;
        this.A08 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A09 = hashMap;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.share.handleractivity.CustomStoryShareHandlerActivity, android.app.Activity] */
    public final void run() {
        ? r1 = this.A07;
        0lg r5 = this.A06;
        Intent intent = this.A02;
        List A1I = AnonymousClass7TE.A1I(this.A04);
        Uri uri = this.A03;
        C61058Jvw jvw = this.A05;
        String str = this.A08;
        int i = this.A01;
        int i2 = this.A00;
        C9854RiT.A00(r1, intent, uri, jvw, r5, new TE5(r1), str, this.A09, A1I, i, i2);
    }
}
