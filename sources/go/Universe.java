package go;

import go.Seq;

public abstract class Universe {

    public final class proxyerror extends Exception implements Seq.Proxy, error {
        public final int refnum;

        public native String error();

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public proxyerror(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public String getMessage() {
            return error();
        }
    }

    public static native void _init();

    public static void touch() {
    }

    static {
        Seq.touch();
        _init();
    }
}
