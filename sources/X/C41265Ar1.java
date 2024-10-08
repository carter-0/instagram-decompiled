package X;

import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import java.io.IOException;

/* renamed from: X.Ar1  reason: case insensitive filesystem */
public final class C41265Ar1 implements Runnable {
    public final /* synthetic */ C363928ka A00;
    public final /* synthetic */ C363928ka A01;
    public final /* synthetic */ C370018vh A02;
    public final /* synthetic */ C369988ve A03;
    public final /* synthetic */ B22 A04;
    public final /* synthetic */ StoryDraftsStore A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public C41265Ar1(C363928ka r1, C363928ka r2, C370018vh r3, C369988ve r4, B22 b22, StoryDraftsStore storyDraftsStore, String str, String str2, String str3, boolean z) {
        this.A05 = storyDraftsStore;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A03 = r4;
        this.A09 = z;
        this.A04 = b22;
    }

    public final void run() {
        long currentTimeMillis;
        StoryDraftsStore storyDraftsStore = this.A05;
        C363928ka r3 = this.A00;
        C363928ka r4 = this.A01;
        C370018vh r5 = this.A02;
        String str = this.A08;
        String str2 = this.A07;
        String str3 = this.A06;
        C369988ve r0 = this.A03;
        boolean z = this.A09;
        if (r0 != null) {
            currentTimeMillis = r0.A00;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        C369988ve r2 = new C369988ve(r3, r4, r5, str2, AnonymousClass7TG.A0j(), str3, str, currentTimeMillis, System.currentTimeMillis(), z);
        try {
            11Z.A02(new C41154ApE(r2, storyDraftsStore, str2));
            B22 b22 = this.A04;
            if (b22 != null) {
                b22.DoK(r2);
            }
        } catch (IOException e) {
            0kD.A0F("StoryDraftsStore", "Failed to save story draft", e);
            B22 b222 = this.A04;
            if (b222 != null) {
                b222.onError(002.A0R("StoryDraftStore#save failed ", r3.A02()));
            }
        }
    }
}
