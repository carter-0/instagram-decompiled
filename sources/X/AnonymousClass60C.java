package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogImageDictIntf;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.api.schemas.NotePogVideoDictIntf;

/* renamed from: X.60C  reason: invalid class name */
public final class AnonymousClass60C extends AnonymousClass0T0 implements AnonymousClass60D {
    public final NotePogImageDict A00;
    public final NotePogVideoDict A01;

    public final AnonymousClass60C F6v() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60C) {
                AnonymousClass60C r5 = (AnonymousClass60C) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        NotePogImageDict notePogImageDict = this.A00;
        int i = 0;
        int hashCode = (notePogImageDict == null ? 0 : notePogImageDict.hashCode()) * 31;
        NotePogVideoDict notePogVideoDict = this.A01;
        if (notePogVideoDict != null) {
            i = notePogVideoDict.hashCode();
        }
        return hashCode + i;
    }

    public final /* bridge */ /* synthetic */ NotePogImageDictIntf BG4() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ NotePogVideoDictIntf CDx() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNotePogVideoResponseInfo", C393439wR.A00(this));
    }

    public AnonymousClass60C(NotePogImageDict notePogImageDict, NotePogVideoDict notePogVideoDict) {
        this.A00 = notePogImageDict;
        this.A01 = notePogVideoDict;
    }
}
