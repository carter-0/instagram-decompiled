package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoNotePogImageDict;
import com.instagram.api.schemas.ImmutablePandoNotePogVideoDict;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogImageDictIntf;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.api.schemas.NotePogVideoDictIntf;

/* renamed from: X.69v  reason: invalid class name and case insensitive filesystem */
public final class C3035569v extends 17P implements AnonymousClass60D {
    public final NotePogImageDictIntf BG4() {
        return (NotePogImageDictIntf) A05(-1443251174, ImmutablePandoNotePogImageDict.class);
    }

    public final NotePogVideoDictIntf CDx() {
        return (NotePogVideoDictIntf) A05(-1618328326, ImmutablePandoNotePogVideoDict.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.69v, com.facebook.pando.TreeJNI, X.60D] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393439wR.A00(this), this);
    }

    public final AnonymousClass60C F6v() {
        NotePogImageDict notePogImageDict;
        NotePogImageDictIntf BG4 = BG4();
        NotePogVideoDict notePogVideoDict = null;
        if (BG4 != null) {
            notePogImageDict = BG4.F6t();
        } else {
            notePogImageDict = null;
        }
        NotePogVideoDictIntf CDx = CDx();
        if (CDx != null) {
            notePogVideoDict = CDx.F6u();
        }
        return new AnonymousClass60C(notePogImageDict, notePogVideoDict);
    }
}
