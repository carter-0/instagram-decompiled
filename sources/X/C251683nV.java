package X;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

/* renamed from: X.3nV  reason: invalid class name and case insensitive filesystem */
public abstract class C251683nV extends C251693nW {
    public FileFilter A00;
    public Comparator A01;
    public final boolean A02;

    public C251683nV(File file, boolean z) {
        super(file);
        Comparator comparator;
        this.A02 = z;
        if (z) {
            comparator = C251633nQ.A04;
        } else {
            comparator = C251633nQ.A05;
        }
        this.A01 = comparator;
    }
}
