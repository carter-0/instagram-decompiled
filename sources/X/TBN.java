package X;

public final class TBN implements Runnable {
    public final /* synthetic */ C7578QKt A00;

    public TBN(C7578QKt qKt) {
        this.A00 = qKt;
    }

    public final void run() {
        this.A00.A00.A0E(new C12054Slh(this, 1), "(function () {\n  return getImagesSizes();\n  function getImagesSizes() { \n    const allImgs = document.querySelectorAll('img');\n    const imageToSizes = {};\n    for (let i = 0; i < allImgs.length; i++) {\n\t  const item = allImgs.item(i);\n      const src = item.src;\n      imageToSizes[src] = {width: item.naturalWidth, height: item.naturalHeight}\n    };\n    return imageToSizes;\n  }\n})();", false);
    }
}
