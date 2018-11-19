package de.reineckm.test.isyfact.core.verwaltung.eingabedaten;

/**
 * Schnittstellenobjekt zum Erzeuges eines neuen Eintrags.
 */
public class NeuerEintrag {
	private String verfasser;
	private String text;
	private String kindVN;
	private String kindNN;
	private String mutterVN;
	private String mutterNN;
	private int prio1;
	private int prio2;
	private int prio3;

	public String getKindNN() {
		return kindNN;
	}

	public void setKindNN(String kindNN) {
		this.kindNN = kindNN;
	}

	public String getMutterVN() {
		return mutterVN;
	}

	public void setMutterVN(String mutterVN) {
		this.mutterVN = mutterVN;
	}

	public String getMutterNN() {
		return mutterNN;
	}

	public void setMutterNN(String mutterNN) {
		this.mutterNN = mutterNN;
	}

	public int getPrio1() {
		return prio1;
	}

	public void setPrio1(int prio1) {
		this.prio1 = prio1;
	}

	public int getPrio2() {
		return prio2;
	}

	public void setPrio2(int prio2) {
		this.prio2 = prio2;
	}

	public int getPrio3() {
		return prio3;
	}

	public void setPrio3(int prio3) {
		this.prio3 = prio3;
	}
;

	public String getKindVN() {
		return kindVN;
	}

	public void setKindVN(String kindVN) {
		this.kindVN = kindVN;
	}

	public String getKindAlter() {
		return kindAlter;
	}

	public void setKindAlter(String kindAlter) {
		this.kindAlter = kindAlter;
	}

	private String kindAlter;

	public NeuerEintrag() {
	}

	/**
	 * Erzeugt ein neues Schnittstellenobjekt für einen neuen Eintrag.
	 *
	 * @param verfasser Der Verfasser des Eintrags
	 * @param text      Der Text des Eintrags
	 */
	public NeuerEintrag(String verfasser, String text) {
		this.verfasser = verfasser;
		this.text = text;
	}

	public String getVerfasser() {
		return verfasser;
	}

	public void setVerfasser(String verfasser) {
		this.verfasser = verfasser;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
