package com.fasterxml.jackson.databind.ext;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.C269674fV;
import X.C9153RRe;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

public class NioPathDeserializer extends StdScalarDeserializer {
    public static final boolean A00;

    public NioPathDeserializer() {
        super(Path.class);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r7, C269674fV r8) {
        if (!r7.A19(16L.A0J)) {
            r8.A0T(r7, Path.class);
        } else {
            String A1P = r7.A1P();
            if (A1P.indexOf(58) < 0 || (A00 && A1P.length() >= 2 && Character.isLetter(A1P.charAt(0)) && A1P.charAt(1) == ':')) {
                return Paths.get(A1P, new String[0]);
            }
            try {
                URI uri = new URI(A1P);
                try {
                    return Paths.get(uri);
                } catch (FileSystemNotFoundException e) {
                    String scheme = uri.getScheme();
                    Iterator<S> it = ServiceLoader.load(FileSystemProvider.class).iterator();
                    while (it.hasNext()) {
                        FileSystemProvider fileSystemProvider = (FileSystemProvider) it.next();
                        if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProvider.getPath(uri);
                        }
                    }
                    r8.A0f(A0H(), e);
                    throw AnonymousClass00P.createAndThrow();
                } catch (Throwable th) {
                    e = th;
                    C9153RRe.A00(e, e);
                    r8.A0f(A0H(), e);
                    throw AnonymousClass00P.createAndThrow();
                }
            } catch (URISyntaxException e2) {
                e = e2;
                r8.A0f(A0H(), e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    static {
        File[] listRoots = File.listRoots();
        int length = listRoots.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String path = listRoots[i].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i++;
        }
        A00 = z;
    }
}
