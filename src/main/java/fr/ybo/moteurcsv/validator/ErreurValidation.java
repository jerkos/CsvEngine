/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     ybonnel - initial API and implementation
 */
package fr.ybo.moteurcsv.validator;

import fr.ybo.moteurcsv.modele.Erreur;

/**
 * Exception permettant de gérer les erreurs de validation.<br/>
 * Exception interne au moteur.
 * 
 * @author ybonnel
 * 
 */
public class ErreurValidation extends Exception {

	/**
	 * Serial.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Erreur.
	 */
	private Erreur erreur;

	/**
	 * Constructeur.
	 * 
	 * @param ligne
	 *            ligne ayant rencontrée l'erreur de validation.
	 */
	public ErreurValidation(String ligne) {
		erreur = new Erreur();
		erreur.setLigneCsv(ligne);
	}

	/**
	 * @return l'erreur de validation rencontrée.
	 */
	public Erreur getErreur() {
		return erreur;
	}

}