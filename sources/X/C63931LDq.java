package X;

import java.io.File;
import java.io.FileDescriptor;

/* renamed from: X.LDq  reason: case insensitive filesystem */
public final class C63931LDq {
    public int A00;
    public LOF A01;
    public File A02;
    public FileDescriptor A03;
    public String A04;
    public boolean A05;

    public final void A00(C63575KzO kzO, Object obj) {
        int i = kzO.A00;
        if (i == 0) {
            this.A02 = (File) obj;
        } else if (i == 1) {
            this.A03 = (FileDescriptor) obj;
        } else if (i == 2) {
            this.A04 = (String) obj;
        } else if (i == 3) {
            this.A05 = AnonymousClass7TE.A1a(obj);
        } else if (i != 4) {
            this.A00 = AnonymousClass7TE.A0M(obj);
        } else {
            this.A01 = (LOF) obj;
        }
    }
}
