package X;

public final class NM8 extends 1P0 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ boolean A06;

    public NM8(String str, String str2, String str3, String str4, 0sP r5, long j, boolean z) {
        this.A06 = z;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = j;
        this.A02 = str4;
        this.A05 = r5;
    }

    public final void onFailInBackground(C268654dm r12) {
        String str;
        int A0D = AnonymousClass7TG.A0D(r12, -363595952);
        if (this.A06) {
            String str2 = this.A04;
            String str3 = this.A03;
            NH5 nh5 = (NH5) r12.A00();
            if (nh5 != null) {
                str = nh5.A01;
            } else {
                str = null;
            }
            0KC.A0O("IgMailboxEncryptedBackups", "Failed to get restoration url in background. Thread id: %s, otid: %s, URL response status code: %s, deliveryObjectId: %s, messageTimestampMs: %d, memMediaType: %s", new Object[]{str2, str3, str, this.A01, Long.valueOf(this.A00), this.A02});
        }
        this.A05.invoke((Object) null);
        AnonymousClass0fD.A0A(-1093718833, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        String str;
        int A032 = AnonymousClass0fD.A03(-1830730513);
        NH5 nh5 = (NH5) obj;
        int A0D = AnonymousClass7TG.A0D(nh5, -553659484);
        if (this.A06 && ((str = nh5.A00) == null || str.length() == 0)) {
            0KC.A0O("IgMailboxEncryptedBackups", "Got empty restoration url in background. Thread id: %s, otid: %s, URL response status code: %s, deliveryObjectId: %s, messageTimestampMs: %d, memMediaType: %s", new Object[]{this.A04, this.A03, nh5.A01, this.A01, Long.valueOf(this.A00), this.A02});
        }
        this.A05.invoke(nh5.A00);
        AnonymousClass0fD.A0A(-1918115658, A0D);
        AnonymousClass0fD.A0A(494786523, A032);
    }
}
