package X;

/* renamed from: X.SqR  reason: case insensitive filesystem */
public final class C12272SqR implements 0bY {
    public final int A00;
    public final Object A01;

    public C12272SqR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void EFS(String str) {
        String str2;
        if (this.A00 != 0) {
            str2 = "SecurePendingIntent";
        } else {
            str2 = "KeepaliveManager-SecurePendingIntent";
        }
        0KC.A0E(str2, str);
    }

    public final void EFT(String str, String str2, Throwable th) {
        Object[] objArr;
        if (this.A00 != 0) {
            0KC.A0J(String.format("tag: %s, file: %s, category: %s", new Object[]{"SecurePendingIntent", "FbnsRegistrarRetry", str}), str2, th);
            return;
        }
        if (th == null) {
            objArr = new Object[]{str, str2};
        } else {
            objArr = new Object[]{str, str2, th};
        }
        0KC.A0Q("%s-%s", "KeepaliveManager-SecurePendingIntent", objArr);
    }
}
